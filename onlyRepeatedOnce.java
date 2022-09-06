import java.util.*;
public class onlyRepeatedOnce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        j=dub(arr, n);
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
        // String str=sc.nextLine();
        // System.out.println(leng(str));
    }
    static int repeatedOnce(int n,int arr[]){
        int res=arr[0];
        for(int i=1;i<n;i++)
             res=res^arr[i];

            return res;
    }
    static int leng(String str){
        int len =0;
        String x=str.trim();
        for(int i=0;i<str.length();i++){
            if(x.charAt(i)==' '){
                len=0;
            }else{
                len++;
            }
        }
        return len;
    }
    static int dub(int arr[],int n){
    if(n==0|| n==1){
        return n;
    }
    int j=0;
    for(int i=0;i<n-1;i++){
        if(arr[i]!=arr[i+1]){
            arr[j++]=arr[i];
        }
    }
    arr[j++]=arr[n-1];
   
    return j;
    }
  
}
