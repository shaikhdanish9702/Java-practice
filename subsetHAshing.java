import java.util.HashSet;
import java.util.Scanner;

public class subsetHAshing {
    public static void main(String[] args) {
       int arr1[]={11,2,3,5,6,9};
       int arr2[]={2,3,1,4};
       int n=arr1.length;
       int m=arr2.length;
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr1[i]);
        }
        int p=s.size();
        for(int i=0;i<m;i++){
            s.add(arr2[i]);
        }
        if(s.size()==p){
            System.out.println("s");
        }else{
            System.out.println("m");
        }
        if(isSubset(arr1, arr2, n, m)){
            System.out.println("subset");
        }else{
            System.out.println("not a subset");
        }
    }
    static boolean isSubset(int arr1[],int arr2[],int n,int m){
        HashSet<Integer> hset= new HashSet<>();
        for(int i=0;i<n;i++){
            if(!hset.contains(arr1[i])){
                hset.add(arr1[i]);
            }
        }
        for(int i=0;i<m;i++){
            if(!hset.contains(arr2[i]))
                return false;
            
        }
        return true;
    }

}
