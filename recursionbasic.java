public class recursionbasic {
    public static void main(String[] args) {
            int n=5;
            System.out.println(fun1(n));
        }

    public static int fun1(int n) {
       if(n==1 || n==0)
       return 1;
       else
       return n*fun1(n-1);
    }
}
