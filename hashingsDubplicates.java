import java.util.*;
public class hashingsDubplicates {
    public static void main(String[] args) {
       int arr[]={2,9,7,8,9};
       int n=arr.length;
       int k=15;
       System.out.println(maxSumSubArray(n, arr, k));
String str="oo00000jwtonschool";
//System.out.println(index(str));
    }
    static int maxSumSubArray(int n,int arr[],int k){
    Map<Integer,Integer> h=new HashMap<>();
    int sum=0;
    int mac=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum==k)
        mac=i+1;
        if(!h.containsKey(sum))
        h.put(sum, i);
        if(h.containsKey(sum-k)){
            if(mac<i-h.get(sum-k)){
                mac=i-h.get(sum-k);
            }
        }
    }
    return mac;
    }
    static int  countSubarraysZero(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        // 1  0  0  1  0  1  1
        // 1 -1 -1  1 -1  1  1
        // 1  0 -1  0 -1  0  1
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                ans++;
            }
            if(hm.containsKey(sum)==true){
                ans+=hm.get(sum);
                int freq=hm.get(sum);
                hm.put(sum, freq+1);
            }else{
                hm.put(sum, 1);
            }
        }
        return ans;
    }
    static int index(String str){
        int size=str.length();
        int min=Integer.MAX_VALUE;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),Integer.MAX_VALUE);
            }else{
                hm.put(str.charAt(i),i);
            }
        }
        for(int i=0;i<size;i++){
            if(min>hm.get(str.charAt(i)))
            return hm.get(str.charAt(i));
        }
        return -1;
    }
}
    

