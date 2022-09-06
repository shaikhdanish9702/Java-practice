import java.util.Scanner;

public class substringpal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.println(pal(str));

    }
    static int pal(String str){
        int n=str.length();
        if(n<2){
            return n;
        }
        //int start=0;
        int maxlength=1;
        int low,high;
        for(int i=0;i<n;i++){
            low=i-1;
            high=i+1;
            while(high<n && str.charAt(i)==str.charAt(high)){
                high++;
            }
            while(low>=0 && str.charAt(i)==str.charAt(low)){
                low--;
            }
            while(low>=0 && high<n &&str.charAt(high)==str.charAt(low)){
                low--;
                high++;
            }
            int length=high-low-1;
            if(maxlength<length){
                maxlength=length;
               // start=low+1;
            }
            }
            // System.out.println(str.substring(start, start+maxlength));
            return maxlength;
        }
    }

