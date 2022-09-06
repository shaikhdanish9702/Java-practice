import java.util.Arrays;

public class sorting {
    public static void main(String args[]) {
        int arr[]={1,2,3,4,5,67,8,8,90,12};
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");

    }System.out.println();
    for(int i=arr.length-1;i>arr.length-4;i--) {
        System.out.print(arr[i]+" ");
    }
    }}
