import java.util.Scanner;

import javax.swing.Icon;

public class binarySearchSqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int item=sc.nextInt();
        System.out.println(sqrt(n, item));
    }
        static float sqrt(int n,int item){
        double ans=0.0;
        int bignum=n-1;
        int smallnum=0;
        int mid=smallnum+(bignum-smallnum)/2;
        while(smallnum<=bignum){
           
            if(mid*mid==n){
               ans=mid;
            break;
            }else if(mid*mid<n){
                smallnum=mid+1;
                ans=mid;
            }else{
                bignum=mid-1;
            } mid=smallnum+(bignum-smallnum)/2;
        }
        double increment=0.1;
        for(int i=0;i<item;i++){
            while(ans*ans<=n){
                ans+=increment;
            }
            ans=ans-increment;
            increment=increment/10;
        }
        return (float)ans;
    }
}
