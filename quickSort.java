import java.util.*;

public class quickSort {
    public static void main(String[] args) {
        
        	Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int p=0;p<n;p++){
		    arr[p]=sc.nextInt();
		}
		sortInWave(arr, n);
		for (int i : arr)
			System.out.print(i + " ");
	}
	static void swap(int arr[], int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	static void sortInWave(int arr[], int n)
	{
		// Sort the input array
		Arrays.sort(arr);

		// Swap adjacent elements
		for (int i=0; i<n-1; i=i +2)
			swap(arr, i, i+1);
	}
}