import java.util.Arrays;

public class longestRepeatingSubsequence{
    static int dp[][]=new int[100][100];
    public static void main(String[] args) {
        String str="a";
        int n=str.length();
        for(int []row :dp){
            Arrays.fill(row,-1);
        }
        for(int[] i:dp)
        System.out.println(dp);
        System.out.println(find(str.toCharArray(), n, n));
    }
    public static int find(char x[],int n,int m) {
        if(dp[n][m]!=-1){
            return dp[n][m]=0;
        }
        if(m==0 || n==0){
            return dp[m][n]=0;
        }
        if(x[n-1]==x[m-1] && n!=m){
            return dp[m][n]=find(x, n-1, m-1)+1;
        }
        return dp[n][m]=Math.max(find(x, n-1, m),find(x, n, m-1));
    }
}