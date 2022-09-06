import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class anagramUsingHashmap {
    public static void main(String[] args) {
        String str1="danny";
        String str2="anndy";
        if(str1.length()!=str2.length())
        System.out.println("not anagram");
        else{
            HashMap<Character,Integer> hm=checkMap(str1);
            HashMap<Character,Integer> tm=checkMap(str2);
            String ns=hm.toString();
            String ms=tm.toString();
            if(ns.toString().equals(ms.toString()))
            System.out.println("anagram");
            else
            System.out.println("not anagram");
           
        }
      
    }
    static HashMap checkMap(String s){
        int i=0;
        boolean found=false;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(i<s.length()){
            found=false;
            Character ch=s.charAt(i);
            for(Character c:hm.keySet()){
                if(ch==c){
                Integer v=hm.get(ch)+1;
                hm.replace(ch,v);
                found=true;
                break;
                }
            }
            if(!found)
            hm.put(ch,new Integer(1));
            i++;
        }
        return hm;
    }
}
