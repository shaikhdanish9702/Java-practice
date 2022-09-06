public class bubbleSorting {
    public static void main(String[] args) {
        int arr[] = { 78, 6, 5, 0, 24, 67, 65 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
