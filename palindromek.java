import java.util.Scanner;

public class palindromek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
       int k= str.length();
        for(int i=k-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("str is palindrome");
        }else{
            System.out.println("str is not palindrome");
        }
    }
}
