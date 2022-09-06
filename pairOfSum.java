import java.util.Scanner;

public class pairOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int item=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sumofPair(n, arr, item);
    }
    static void sumofPair(int n,int arr[],int item){
        int n1=0;
        int n2=n-1;
        while(n1<n2){
            if(arr[n1]+arr[n2]==item){
                System.out.println("("+ arr[n1]+","+arr[n2]+")");
                
            }else if(arr[n1]+arr[n2]>item){
                n2--;
            }else if(arr[n1]+arr[n2]<item){
                n1++;
            }
        }
    }
}
