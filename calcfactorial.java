import java.util.Scanner;
public class calcfactorial {
    public static int cal(int n) {
        if(n ==1 || n == 0) {
            return 1;
        }
        int fac = cal(n-1);
        int fac1 =n * fac;
        return fac1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = cal(n);
        System.out.println(ans);
        
    } 
}
