import java.util.Scanner;

public class binarysearchdonotuseLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int item=sc.nextInt();
        System.out.println(doNotUseLength(arr, item));

    }
    static int doNotUseLength(int arr[],int item){
        int l=0;
        int h=l+10;
        while(l<h){
            if(arr[l]<=item && arr[h]>=item){
                while(l<h){
                    int mid=l+(h-l)/2;
                    if(arr[mid]==item){
                        System.out.print(mid);
                    }else if(arr[mid]>item){
                        h=mid-1;
                    } else{
                        l=mid+1;
                    }
                }
            }else{
                l=h+1;
                h=h+10;
            }
        }
        return 0;
    }
}
