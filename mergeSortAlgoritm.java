import java.util.Scanner;

class mergeSortAlgoritm{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.err.print(arr[i]+" ");
        }
    }
    static void divide(int arr[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            divide(arr, low, mid);
            divide(arr, mid+1, high);
            conquer(arr, low, mid, high);
    }
    }
    static void conquer(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int l[]=new int[n1];
        int h[]=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            h[j]=arr[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<n1 &&j<n2){
            if(l[i]<=h[j]){
                arr[k]=l[i];
                i++;
            }else{
                arr[k]=h[j];
                j++;
            }k++;
        }
        while(i<n1){
            arr[k]=l[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=h[j];
            j++;
            k++;
        }
    }
}