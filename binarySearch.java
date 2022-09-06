import java.util.Scanner;

public class binarySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int item=sc.nextInt();
        int higherNumber=n-1;
        int lowerNumber=0;
        int mid=lowerNumber+(higherNumber-lowerNumber)/2;
        while(lowerNumber<=higherNumber){
            if(arr[mid]==item){
                System.out.println(mid);
                break;
            }else if(arr[mid]<item){
                lowerNumber=mid+1;
            }else{
                higherNumber=mid-1;
            }mid=lowerNumber+(higherNumber-lowerNumber)/2;
        }
    }
}