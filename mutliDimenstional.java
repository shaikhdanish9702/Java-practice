import java.lang.*;
import java.util.*;

public class mutliDimenstional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void divide(int arr[],int l,int r){
        if(l<r){
            int pi=partition(arr,l,r);
            divide(arr, l, pi-1);
            divide(arr, pi+1, r);
        }
    }
    static int partition(int arr[],int l,int r){
        int pivot=arr[r];
        int i=l-1;
        for(int j=l;j<r-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
    
            }
        }swap(arr, i+1, r);
        return (i+1);
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

    }
}

    
    