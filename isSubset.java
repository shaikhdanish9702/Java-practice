import java.util.*;

public class isSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }if(subset(arr1, arr2, n, m))
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println("arr2 is a not subset of arr2");
        
        }
    static boolean subset(int arr1[],int arr2[],int n,int m){
        int i=0,j=0;
        if(n<m){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr1[i]==arr2[j]){
                j++;
                i++;
            }else if(arr1[i]>arr2[j]){
                return false;
            }

        }
        if(j<m){
            return false;
        }else{
            return true;
        }
    }
}
