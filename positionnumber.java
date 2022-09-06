import java.util.Scanner;

public class positionnumber {
        static int floorSearch(
            int arr[], int n, int x)
        {
            if (x >= arr[n - 1])
                return n - 1;
            if (x < arr[0])
                return -1;
            for (int i = 1; i < n; i++)
                if (arr[i] > x)
                    return i-1;
            return -1;
        }
        
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int x=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
            int index = floorSearch(arr, n - 1, x);
            if (index == -1)
                System.out.print(-1);
            else
                System.out.print(index);
        }
    }
}
   