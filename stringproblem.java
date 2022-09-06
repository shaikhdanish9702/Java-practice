import java.util.Scanner;
public class stringproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String rev="";
        char ch;
        for(int i=0;i<n;i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
            if(str.equals(rev)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
}
