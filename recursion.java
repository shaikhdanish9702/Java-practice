import java.util.Scanner;
public class recursion {
    public static void main(String args[]) {
        int [] arr = {2, 13, 16, 21, 34, 67, 81};
        Scanner sc = new Scanner(System.in);
        int numToFind = sc.nextInt();
        int result = binarySearch(arr, numToFind);
        System.out.println(result);
        sc.close();
    }
    static int binarySearch(int[] arr, int numToFind) {
        int low = 0, high = arr.length - 1;
        while(low <=high) {
            int mid = (high + low) / 2;
            if(arr[mid] == numToFind) {
                return mid;
            } else if (arr[mid] > numToFind) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
