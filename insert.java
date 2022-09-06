import java.util.*;
public class insert {
    public static int[] insertX(int n, int arr[],
								int x, int pos)
	{
		int i;
		int newarr[] = new int[n + 1];
		for (i = 0; i < n + 1; i++) {
			if (i < pos - 1)
				newarr[i] = arr[i];
			else if (i == pos - 1)
				newarr[i] = x;
		}
		return newarr;
	}
	public static void main(String[] args)
	{
        int i;
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
		int n = sc.nextInt();
        int x = sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}

		int pos = arr.length+1;

		
		arr = insertX(n, arr, x, pos);

		// print the updated array
        for(i =0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}System.out.println();
    }}
}
