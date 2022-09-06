public class CountBalancedBinaryTrees {
    public static void main(String[] args) {
        int h=3;
        System.out.println(countBB(h));
    }
    public static long countBB(int h) {
        long dp[]=new long[h+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=h;i++){
            dp[i]=(dp[i-1]*dp[i-2])+(dp[i-1]*dp[i-2])+(dp[i-1]*dp[i-1]);
        }
        return dp[h];
    }
}
