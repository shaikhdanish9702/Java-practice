public class practice {
    public static int calp(int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return calp(x, n/2) * calp(x, n/2);
        } 
        else {
            return calp(x, n/2) * calp(x, n/2) * x;
        }
    }
    public static void main(String args[]) {
        int n[] = {1,2,3,4,5,6,7,8,9}; 
        int ans = calp(n);
        System.out.println(ans);
        
    }
    
}
