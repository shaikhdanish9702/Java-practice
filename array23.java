import java.util.*;

public class array23 {
    public static void main(String agrs[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        find(arr, n, x);
        }
    }
    static void find(int arr[],int n,int x)
    {
        StringBuffer stringBuffer=new StringBuffer();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                found=true;
                stringBuffer.append(i+" ");
            }
        }
        if(found==true)
        System.out.println(stringBuffer.toString());
              else{(found==false) 
                  System.out.println("not found");
              }

    }
}
