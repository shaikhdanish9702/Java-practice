public class climbingStairs {
    public static void main(String[] args) {
        int n=12;
        System.out.println(stairCount(n));
    }
    private static int stairCount(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
