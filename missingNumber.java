import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        PrintTwo(arr, n);
    }
    static void PrintTwo(int arr[],int n){
        int i;
        for(i=0;i<n;i++){
            int val=Math.abs(arr[i]);
            if(arr[val-1]>0)
            arr[val-1]= -arr[val-1];
            else
            System.out.println(val);
        }
        for(i=0;i<n;i++){
            if(arr[i]>0){
                System.out.println(i+1);
            }
        }
    }
}
