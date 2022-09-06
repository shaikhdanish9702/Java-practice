import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(size(n));
    }
    static int size(int n){
        if(n==0 ||n==1){
            return n;
        }
        int i=1;
        int res=1;
        while(res<=n){
            i++;
            res=i*i;
        }
        return i-1;
    }
}
