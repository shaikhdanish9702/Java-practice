import java.text.SimpleDateFormat;  
import java.util.Date;

public class java {
    public static void main(String[] args) {
        String a="love";
        String b="you";
        a=a+b;
         b=a.substring(0,a.length()-b.length());
         a=a.substring(b.length());
         System.out.println(a+" "+b);
    }
}