public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 67, 45, 98, 34, 23, 76, 34, 9, 45 };
        merge(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void merge(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            merge(arr, l, m);
            merge(arr, m + 1, r);
            sort(arr, l, m, r);
        }
    }

    static void sort(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }

}
