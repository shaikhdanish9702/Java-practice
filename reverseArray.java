public class reverseArray {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 9, 5, 6, 5, 2, 8 };
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; j--, i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
