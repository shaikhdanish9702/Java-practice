import java.util.HashMap;
import java.util.Scanner;

public class hashmapnonrepeating {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(intdexofsinglecharecter(s));
	}
    static int intdexofsinglecharecter(String s){
        int size = s.length();
        
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<size;i++){
            if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),Integer.MAX_VALUE);
            }else{
            map.put(s.charAt(i),i);
        
            }
        }
        for(int i=0; i<size;i++){
            if(min>map.get(s.charAt(i)))
            return map.get(s.charAt(i));
        }
        return -1;
    }
    
}
