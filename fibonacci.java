import java.util.Scanner;
public class Fibonacci{
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
       System.out.print(findFibonacci(index));
}
static int findFibonacci(int index) {
    if(index == 1) {
        return 0;
    }
    if(index5 == 2) {
        return 1;
    }
    return findFibonacci(n-1) + findFibonacci(n-2);
}
}