import java.util.Scanner;

public class donate {
    public static void main(String arg[] ) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int count=0;
        int result=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                System.out.print(0+" ");
                max=arr[i];
            }else if(arr[i]<max){
                result=max-arr[i];
                count=count+result;
                System.out.print(result+" "); 
            }else if(arr[i]==max) {
                System.out.print(0+" ");
                max=arr[i];
            }
            count=count+arr[i];
            
        }System.out.println();
        System.out.print(count);
    }
}
