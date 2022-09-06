import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(secondMaxNumber(arr, n));

    }
    static int secondMaxNumber(int arr[],int n){
        int fisrt=0;
        int second=0;
        for(int i=0;i<n;i++){
            if(arr[i]>fisrt){
                second=fisrt;
                fisrt=arr[i];
            }else if(arr[i]>second && arr[i]!=fisrt){
                second=arr[i];
            }
        }
        return second;
    }
}
