import java.util.*;
import java.util.Arrays;
public class maxNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=arr.length-1;i>arr.length-4;i--){
                System.out.print(arr[i]+" ");
            }
           
        }
    }
}

