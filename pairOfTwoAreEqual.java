import java.util.Arrays;
import java.util.HashMap;

public class pairOfTwoAreEqual {
    private pairs p;
    class pairs{
        int first;
        int second;
        pairs(int f,int s){
            first=f;second=s;
        }
    }
    boolean pair(int arr[]){
        HashMap<Integer,pairs> hm= new HashMap<Integer,pairs>();
        int n=arr.length;
        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;++j){
                int sum=arr[i]+arr[j];
                if(!hm.containsKey(sum)){
                    hm.put(sum,new pairs(i,j));
                } else{
                    p = hm.get(sum);
                
                System.out.println(arr[p.first]+" " +arr[p.second]+" "+arr[i]+" "+arr[j]);
                return true;
            }
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,4,7,1,2,9,8};
        pairOfTwoAreEqual a=new pairOfTwoAreEqual();
        a.pair(arr);
        
    }
}
