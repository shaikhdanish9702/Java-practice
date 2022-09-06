import java.util.Scanner;

public class maxProfit {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(maxtwobuysell(arr,size));
	}
	static int maxtwobuysell(int arr[],int size) {
    int buy1 = Integer.MIN_VALUE;
      int sell1 = 0;
      int buy2 = Integer.MIN_VALUE;
      int sell2 = 0;
       
      for(int i = 0; i < size; i++) {
         
          buy1 = Math.max(buy1,-arr[i]);
          sell1 = Math.max(sell1,buy1+arr[i]);
          buy2 = Math.max(buy2,sell1-arr[i]);
          sell2 = Math.max(sell2,buy2+arr[i]);
       
    }
     return sell2;
}
}
