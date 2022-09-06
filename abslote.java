import java.util.*;

public class abslote {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        i = 0;
        while (count0 > 0) {
            arr[i++] = 0;
            count0--;
        }
        while (count2 > 0) {
            arr[i++] = 2;
            count2--;
        }
        while (count1 > 0) {
            arr[i++] = 1;
            count1--;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

class largestNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int sum = target - arr[i];
            if (hm.containsValue(sum)) {
                int Toreturn[] = { hm.get(sum), i };
            } else {
                hm.put(i, arr[i]);
            }
        }
    }
}

class bigger {
    public static void main(String[] args) {
        int x = 1;
        int y = 9;
        int z = 10;
        if (x >= y) {
            if (x >= z) {
                System.out.println("x");
            } else if (z >= x) {
                System.out.println("z");
            }
        } else if (y >= x) {
            if (y >= z) {
                System.out.println("y");
            } else if (z >= y) {
                System.out.println("z");
            }
        } else if (z >= x) {
            if (z >= y) {
                System.out.println("z");
            } else if (y >= z) {
                System.out.println("y");
            }
        }
    }
}

class second {
    public static void main(String[] args) {
        int arr[] = { 34, 76, 97, 05, 98, 6, 76 };
        int frist = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > frist) {
                int temp = frist;
                frist = arr[i];
                second = temp;
            } else if (arr[i] > second && arr[i] != frist) {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}

