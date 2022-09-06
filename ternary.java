import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int item=sc.nextInt();
        int higherNumber=size-1;
        int lowerNumber=0;
        int mid1=lowerNumber+(higherNumber-lowerNumber)/3;
        int mid2=higherNumber-(higherNumber-lowerNumber)/3;
        while(lowerNumber<=higherNumber)
        {
            if(arr[mid1]==item){
                System.out.println(mid1);
                break;
            }
            else if(arr[mid2]==item) {
                System.out.println(mid2);
                break;
            }
            else if(arr[mid1]>item){
                higherNumber=mid1-1;
            }
            else if(arr[mid2]<item) {
                lowerNumber=mid2+1;
            }else{
                higherNumber=mid2-1;
                lowerNumber=mid1+1;
            }
            mid1=lowerNumber+(higherNumber-lowerNumber)/3;
            mid2=higherNumber-(higherNumber-lowerNumber)/3;
        }        
    }
}
