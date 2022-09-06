import java.util.Arrays;

public class javaInterviewProblem {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,7,8,9,10};
         int second=0;
         int first=0;
         for(int i=0;i<arr.length;i++){
             if(first<arr[i]){
                 second=first;
                 first=arr[i];
             }else if(second<arr[i] && first!=arr[i]){
                 second=arr[i];
             }
         }
        //  System.out.println(second);
        int n=6;
        n=n>>1;
        System.out.println(n);
    }
}


       
