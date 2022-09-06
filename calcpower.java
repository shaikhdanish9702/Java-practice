import java.util.Scanner;

public class calcpower {
    public static int power(int x, int y) {
        if(y == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        if(y % 2 == 0) {
            return power(x, y/2) * power(x, y/2);
        } else {
            return power(x, y/2) * power(x, y/2) * x;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x,y));
        
    } 
}
