import java.util.Scanner;

public class prime {
    public static void main(String[]args) {
        int num,count=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++) {
            if(num%i==0)
            {
                count++;
            }
        }
        
    }
    
}
