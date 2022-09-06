import java.util.Scanner;

public class merge626 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void merge(int arr[],int l,int mid,int r){
        int n=mid-l+1;
        int m=r-mid;
        int U[]=new int[n];
        int P[]=new int[m];
        for(int i=0;i<n;i++){
            U[i]=arr[l+i];
        }
        for(int j=0;j<m;j++){
            P[j]=arr[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n &&j<m){
            if(U[i]<=P[j]){
                arr[k]=U[i];
                i++;
            }else{
                arr[k]=P[j];
                j++;
            }
            k++;
        }
        while(i<n){
            arr[k]=U[i];
                i++; 
                k++;
        }
        while(j<m){
            arr[k]=U[j];
                j++; 
                k++;
        }

    }
    static void divide(int arr[],int l,int r){
        if(l<r){
            int mid=(l+(r-l))/2;
            divide(arr, l, mid);
            divide(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
}