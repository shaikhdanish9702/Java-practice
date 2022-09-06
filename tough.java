import java.util.Scanner;

public class tough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = takeInputArray(sc);
        System.out.println("enter the number do you want to find ");
        int numberToFind = sc.nextInt();
        int result = findNum(arr,numberToFind);
        if(result == -1) {
            System.out.println("index nor found");
        }else{
            System.out.println("the number is at index" +result);
        }
        sc.close();
    }
    static int[] takeInputArray(Scanner sc) {

        }
        return arr;
}
    static int findNum(int[] arr, int numberToFind){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == numberToFind) {
                return i;
            }
        }
    return -1;
}
}
