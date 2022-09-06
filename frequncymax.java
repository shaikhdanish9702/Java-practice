import java.util.*;
public class frequncymax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxi=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(i!=j){
                    if(arr[i]==arr[j+1]){
                        int temp=maxi;
                        maxi=arr[i];
                        maxi=Math.max(temp, maxi);
                    }
                }
            }
        }
            
        
        System.out.println(maxi);
    }
}
