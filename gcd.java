public class gcd {
    public static void main(String[] args) {
        int n = 12;
        int m = 9;
        System.out.println(gcd(n, m));
    }

    static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }

        return gcd(m, n % m);
    }
}
