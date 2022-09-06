import java.io.*;
import java.util.*;
class modinverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<=t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(ans(a,b));
        }
    }
    static int ans(int a, int b) {
        for(int x=1;x<b;x++)
            if((a%b)+(x%b)%b==1)
                return x;
        {
        return -1;
    }
}
}
