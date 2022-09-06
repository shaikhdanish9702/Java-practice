import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        divide(arr,0 ,arr.length-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void divide(int arr[],int low,int high){
        if(low<high){
        int mid=low+(high-low)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        conqure(arr,low,mid,high);
    }
}
    static void conqure(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int L[]=new int[n1];
        int H[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            H[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<n1 &&j<n2){
            if(L[i]<=H[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=H[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=H[j];
            j++;
            k++;
        }

    }
}
