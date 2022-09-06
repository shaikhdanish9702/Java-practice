public class array3 {
    public static void name() {
        
    }
    static int[] take() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new [length];
        for(int i=0;i<length; i++) {
            int j = sc.nextInt();
            arr[i] = j;
        }
    }
}
