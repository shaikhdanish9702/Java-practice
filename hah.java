import java.util.Scanner;

public class hah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     int max=Integer.MIN_VALUE;
     int sum=0;
     for(int i=0;i<n;i++){
         sum+=arr[i];
         if(max<sum){
             max=sum;
         }if(sum<0){
             sum=0;
         }
     }System.out.println(sum);
    }
}
