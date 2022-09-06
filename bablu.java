import java.util.Scanner;

public class bablu {
    public static void printnum(int n) {
        if(n == 22) {
            return;
        }
        System.out.println(n);
        printnum(n+2);
    }
        
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnum(n);
    }
}
