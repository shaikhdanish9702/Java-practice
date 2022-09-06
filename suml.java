import java.util.*;
public class suml {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
      }
     // System.out.println(missingnumber(n, arr));
      //System.out.println(maxtwo(n, arr));
      //System.out.println(positiveNumber(n, arr));
      repeating(n, arr);
    }
    static int maxtwo(int n,int arr[]){
      int i;
      int first=0;
      int second=0;
      if(n<2){
        System.out.println("invalid number");
      }
      for(i=0;i<n;i++){
        first=Math.max(first, arr[i]);
      }
      for(i=0;i<n;i++){
        if(arr[i]!=first){
        second=Math.max(second, arr[i]);
        }
    } 
    return second;
  }
  static int missingnumber(int n,int arr[]){
    int sum=((n+1)*(n+2))/2;
    for(int i=0;i<n;i++){
      sum=sum-arr[i];

    }return sum;
  }
  static int positiveNumber(int n,int arr[]){
    int sum=0;
    for(int i=0;i<n;i++){
      if(arr[i]>=0)
        sum =sum+ arr[i];
    }
    return sum;
  }
  static void repeating(int n,int arr[]){
    LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
    for(int i=0;i<n;i++)
      set.add(arr[i]);
      System.out.println(set);
  }
}