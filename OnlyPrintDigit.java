import java.util.*;
public class OnlyPrintDigit {
    public static void main(String[] args) {
        String str="abc@147#25%gd&b";
        int n=str.length();
        char ch[]=str.toCharArray();
        String st="";
        String sr="";
        for(int i=0;i<n;i++){
            if(Character.isDigit(ch[i])){
                if(ch[i]%2==0)
                 st+=ch[i];
           
                if(ch[i]%2!=0)
                sr+=ch[i];
            }
        }
        System.out.println(st+sr);
    }
}

