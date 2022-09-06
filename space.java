import java.util.Scanner;

public class space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNum = printReverse(num, 0);
        System.out.println(reverseNum);
        sc.close();
    }
    static int printReverse(int num, int result) {
        if (num == 0) {
            return result;
        }
        int remainder = num % 10;
        result = (result * 10) + remainder;
        num = num / 10;
        return printReverse(num, result);
    }
}
