import java.util.Scanner;
public class array {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInputArray(sc);
    }
    static int[] takeInputArray(Scanner sc) {
        int[] arr= new int[enter];
        for (int i = 0; i = enter.length; i++) {
            int enter = sc.nextInt();
            arr[i] = enter;
        }
        System.out.println("enter a length of array");
        int length = sc.nextInt();
        System.out.println("enter a number with giving space");
        int[] arr = new int[length];

        for(int i = 0; i < length; i++) {
            int enteredNum = sc.nextInt();
            arr[i] = enteredNum;
        }
        return arr;
}
}
