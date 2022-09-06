import java.util.Scanner;

public class sumofdigit {
    public static int digit(int n) {
        if(n == 0) {
            return 0;
        }
        return n % 10 + digit(n/10);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = digit(n);
        System.out.println(ans);
    }
}
