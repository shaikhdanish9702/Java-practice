import java.util.HashMap;
import java.util.Hashtable;

public class searchForWieght {
    public static void main(String[] args) {
//   int arr[]={1,6,5,8,1,6,8,3,9};
//   HashMapcret(arr);
HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
hm.put(1, 2);
hm.put(2, 5);
hm.put(5, 7);
hm.put(8, 9);
System.out.println(hm);
System.out.println(hm.get(2));
System.out.println(hm.size());
System.out.println(hm.entrySet());
System.out.println(hm.containsKey(89));
System.out.println(hm.containsValue(7));
System.out.println(hm.clone());
System.out.println(hm.remove(8,9));
System.out.println(hm);
System.out.println(hm.replace(1, 2, 7));
System.out.println(hm);
    }
    static void HashMapcret(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            Integer n=hm.get(arr[i]);
            if(hm.get(arr[i])==null){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],++n);
            }
        }
        System.out.println(hm);
    }
}
   