import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        System.out.println("enter a length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("enter a number with giving space");
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            int enteredNum = sc.nextInt();
            arr[i] = enteredNum;
        }
    }

}
