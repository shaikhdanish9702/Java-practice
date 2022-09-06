import java.util.Collection;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sorting(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void sorting(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
}
