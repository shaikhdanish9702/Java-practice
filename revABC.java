import java.util.Arrays;
import java.util.Scanner;

public class revABC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        char[] ch1=str.toCharArray();
        String str2=sc.nextLine();
        char[] ch2=str.toCharArray();
        //  revOnlyChar(charArray);
        //  String rev= new String(charArray);
        //  System.out.println(rev);
        anagram(ch1, ch2);
        S


    }
    static void revOnlyChar(char str[]){
       int  last=str.length-1;
       int first=0;
       while(first<last){
           if(!Character.isAlphabetic(str[first]))
           first++;
           else if(!Character.isAlphabetic(str[last]))
           last--;
           else{
               char temp=str[first];
               str[first]=str[last];
               str[last]=temp;
               first++;
               last--;
           }
       }
        
    }
    public static boolean anagram(char []a,char []b) {
        int n=a.length;
        int m=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
