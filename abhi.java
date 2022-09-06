import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class abhi {
	public static void main (String[] args){
                    Scanner sc = new Scanner(System.in);
            int n= sc.next(pattern)
            long[]  arr=new long[n];
            long[]  arr1=new long[n];
            long sum=0,b=0;
            for(int i=0;i<n;i++){
               arr[i]= sc.nextLong();
               sum=sum+arr[i];
            }
            for(int i=1;i<n;i++){
               arr1[0]=0;
               if(arr[i-1]<=arr[i]){
                  if(b<arr[i]){
                     b=arr[i];
                  }
                  arr1[i+1]=0;
               }else{
                  arr1[i]=b-arr[i];
               }
            }

            for(int i=0;i<n;i++){
               System.out.print(arr1[i]+" ");
               sum=sum+arr1[i];
            }
            System.out.print("\n"+sum);


    }
}