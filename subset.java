import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int brr[]={1,3,5};
        Set<Integer> hm= new HashSet<>();
        Set<Integer> hm1=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hm.add(arr[i]);
        }
        for(int i=0;i<brr.length;i++){
            hm1.add(brr[i]);
        }
        if(hm.containsAll(hm1)){
            System.out.println("subset");
        }else{
            System.out.println("not a subset");
        }
        } 
    }

// [1,2,3,4,5,6]

// [1,3,5]

// [1,3,9]