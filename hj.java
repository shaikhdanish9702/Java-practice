import java.util.Scanner;
public class hj {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        if(n<=0) {
            System.out.println("invalid size of array");
            System.exit(0);
        }

        int arr[]=new int[n];
        System.out.println("enter the element of the array you given size");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("");
        int item = sc.nextInt();
        int lowerNumber= 0;
        int higherNumber=n-1;
        int mid =(lowerNumber+higherNumber)/2;
        while(lowerNumber<=higherNumber) {
            if(arr[mid]==item) { 
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<item) {
                lowerNumber=mid+1;
            } else{
                higherNumber=mid-1;
            } mid =(lowerNumber+higherNumber)/2;
        }
        if(lowerNumber>higherNumber) {
            System.out.println("item is not found");
        }
        } 
    }
