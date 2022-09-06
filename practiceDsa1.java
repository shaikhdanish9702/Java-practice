import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javafx.stage.StageStyle;

public class practiceDsa1 {
    public static void main(String[] args) {
        int arr1[] = { 5, 9, 9, 10 };
        int arr2[] = { 10, 13, 15 }; // mergeArr={5,9,10,13,15}
        int n = arr1.length;
        int m = arr2.length;

        sortTwoArray(arr1, arr2, n, m);
    }

    static void sortTwoArray(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (!arr.contains(arr1[i])) {
                    arr.add(arr1[i]);

                }
                i++;
            } else {
                if (!arr.contains(arr2[j])) {
                    arr.add(arr2[j]);

                }
                j++;
            }
        }
        while (i < n) {
            if (!arr.contains(arr1[i])) {
                arr.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (!arr.contains(arr2[j])) {
                arr.add(arr2[j]);

            }
            j++;
        }
        for (int k = 0; k < arr.size(); k++) {
            System.out.print(arr.get(k) + " ");
        }
    }
}

// arr={0,0,0,1,1,1}

// 3

// ar={0,0,0}

// 0

// arr={1,1,1,1}

// 4
class freq {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 1, 1 };
        System.out.println(count(arr, 0, arr.length - 1));
    }

    static int count(int arr[], int l, int h) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            if ((mid == l || arr[mid - 1] == 0) && arr[mid] == 1) {
                return mid + 1;
            }
            if (arr[mid] == 1) {
                return count(arr, l, mid + 1);
            }

            return count(arr, mid - 1, h);
        }
        return 0;
    }
}
