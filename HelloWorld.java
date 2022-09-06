import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner sc = new Scanner(System.in);
        while(condition == true) {
            System.out.println("Do you want to enter a number? ");
            String truthValue = sc.nextLine();
            if(truthValue.equals("Yes") || truthValue.equals("yes")) {
                int num = sc.nextInt();
                System.out.println(sumofDigits(num));
            } else if (truthValue.equals("No") || truthValue.equals("no")){
                condition = false;
            }
    }sc.close();
}
static int sumofDigit(int n) {
    int sum = 0,remainder;
    while (n > 0) {
        remainder =n%10;
        sum = sum + remainder;
        n = n / 10;
    }
    return sum;
}
}


