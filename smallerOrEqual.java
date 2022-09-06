import java.util.Scanner;

public class smallerOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int item=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(find(n, arr, item));

    }
    static int find(int n,int arr[],int item){
        int low=0;
        int high=n-1;
        int count=0;
        int mid=0;
        while(arr[low]<arr[high]){
            mid=low+(high-low)/2;
            if(arr[mid]<=item){
                count=mid+1;
                low=mid+1;
            }else{
                high= mid-1;
            }
        }
        return count;
    }
}
