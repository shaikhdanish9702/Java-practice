import java.util.Scanner;

public class sum {
    public static void printsum(int n, int i, int sum) {
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(n, i+1, sum);
        System.out.println(i);
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i = sc.nextInt();
    int sum = sc.nextInt();
    printsum(n, i, sum);

}
}

