import java.util.Arrays;
import java.util.Scanner;

public class positivesortingjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
       
        for(int j=0;j<n;j++){
           System.out.println(arr[j]);
        }
    }
}
