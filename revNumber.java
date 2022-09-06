import java.util.Scanner;

public class revNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int reminder=n%10;
            rev=rev*10+reminder;
            n=n/10;
        } 
        System.out.println(rev);
    }
}
