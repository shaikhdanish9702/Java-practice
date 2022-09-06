import java.util.Scanner;

public class duplicacy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }sortdata(arr, n);
        for (int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void sortdata(int arr[],int n){
        int val=0;
        int pos=0;
        for(int i=0;i<n;i++){
            val=arr[i];
            pos=i;
            for(;pos>0 && arr[pos-1]>val;){
                arr[pos]=arr[pos-1];
                pos=pos-1;
            }
            arr[pos]=val;
        }
    }
}
