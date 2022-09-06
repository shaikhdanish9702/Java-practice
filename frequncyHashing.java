import java.util.*;

public class frequncyHashing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr=max(n, arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static Map<Integer,Integer> hm;
    static int[] max(int n,int arr[]){
        hm=new HashMap<>();
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,1+hm.get(i));
            }else{
                hm.put(i, 1);
            }
        }
        Integer num[]=new Integer[n];
        int k=0;
        for(int i:arr){
            num[k]=i;
            k++;
        }
        Arrays.sort(num,new comp() );
        k=0;
        for(int i:num){
            arr[k]=i;
            k++;
        }
        return arr;
    }
}
class comp implements Comparator<Integer>{
    Map<Integer,Integer> hm=frequncyHashing.hm;
    public int compare(Integer a,Integer b){
        if(hm.get(a)>hm.get(b)){
            return 1;
        }
        else if(hm.get(b)>hm.get(a)){
            return -1;
        }else{
            if(a>b){
                return -1;
            }else if(a<b){
                return 1;
            }
        }
        return 0;
    }
}
