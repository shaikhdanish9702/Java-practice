import java.util.Scanner;

public class twoMedian {
    public static void main(String[] args) {
        int[] arr1 = { -5, 3, 6, 12, 15 };
        int[] arr2 = { -12, -10, -6, -3, 4, 10 }; 
        System.out.println(findMedian(arr1, arr2));
    }
    static double findMedian(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        if(n>m){
            return findMedian(arr2, arr1);
        }
        int start=0;
        int end=n;
        int real=(n+m+1)/2;
        while(start<=end){
            int mid=(start+end)/2;
            int leftsizeA=mid;
            int leftsizeB=real-mid;
            int leftA=(leftsizeA>0)?arr1[leftsizeA-1]:Integer.MIN_VALUE;
            int rightA=(leftsizeA<n)?arr1[leftsizeA]:Integer.MAX_VALUE;
            int leftB=(leftsizeB>0)?arr2[leftsizeB-1]:Integer.MIN_VALUE;
            int rightB=(leftsizeB<m)?arr2[leftsizeB]:Integer.MAX_VALUE;
            if(leftA<=rightB && leftB<=rightA){
                if((m+n)%2==0)
                    return (Math.max(leftA,leftB))+Math.min(rightA, rightB)/2.0;
                return Math.max(leftA, leftB);
            }
            else if(leftA>rightB){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return 0.0;
    }
}
