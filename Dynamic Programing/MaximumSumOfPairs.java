import java.util.Arrays;
public class MaximumSumOfPairs{
    public static void main(String[] args) {
        int arr[]={3,5,10,12,17,15,9};
        int n=arr.length;
        int k=4;
        System.out.println(SumOfPairs(arr,n,k));
        
    }
    private static int SumOfPairs(int arr[],int n,int k) {
        Arrays.sort(arr);
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            dp[i]=dp[i-1];
            if(arr[i]-arr[i-1]<k){
                if(i>=2){
                    dp[i]=Math.max(dp[i],dp[i-2]+arr[i]+arr[i-1]);
                    continue;
                }
                dp[i]=Math.max(dp[i],arr[i]+arr[i-1]);
            }
        }
        return dp[n-1];
    }

}
