import java.util.HashSet;

public class HashsetPairSum {
    public static void main(String[] args) {
        int arr1[]={11,2,3,5,6,9};
        int sum=11;
        int n=arr1.length;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            int temp=sum-arr1[i];
            if(h.contains(temp)){
                System.out.println(arr1[i]+" "+temp);
            }
            h.add(arr1[i]);
        }
    }
}
