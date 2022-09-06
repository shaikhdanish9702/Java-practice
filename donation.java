import java.util.Scanner;

public class donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] arr = new long[num];
        int i;
        for(i=0;i<num;i++) {
            arr[i] = sc.nextLong();
            }
            long max = 0;
            long result = 0;

        for(i=0; i<num; i++) {
            if(arr[i] > max) {
                System.out.print(0+" ");
                max = arr[i];
            } else if(arr[i] < max) {
                result = max - arr[i];
                System.out.print(result+" ");

    }
}
    }
}