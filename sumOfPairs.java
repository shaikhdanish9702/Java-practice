import java.util.*;

public class sumOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        sumPairs(n, arr, sum);
    }
    static boolean sumPairs(int n,int arr[],int sum){
        Arrays.sort(arr);
        int h=n-1;
        int l=0;
        while(l<h){
            if(arr[l]+arr[h]==sum){
                System.out.println("("+arr[l]+","+arr[h]+")");
                return true;
            }else if(arr[l]+arr[h]<sum){
                l++;
            }else{
                h++;
            }
        }
        System.out.println("invalid");
        return false;
    }
}
