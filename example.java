import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInputArray(sc);
        System.out.println("enter the number you want to find");
        int numberToFind = sc.nextInt();
        int result = findNum(arr,numberToFind);
        if(result == -1) {
            System.out.println("Index not found");
        }else{
            System.out.println("the number is at index: " +result);
        }
        sc.close();
    }
    static int[] takeInputArray(Scanner sc) {
        System.out.println("Enter the length of array");
        int length = sc.nextInt();
        System.out.println("Please enter the array number using space");
        int[] arr = new int[length];

        for(int i = 0; i < length; i++) {
            int enteredNum = sc.nextInt();
            arr[i] =enteredNum;
        }
        return arr;
}
    static int findNum(int[] arr, int numberToFind) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == numberToFind) {
                return i;
            }
        }
    return -1;
}
}
