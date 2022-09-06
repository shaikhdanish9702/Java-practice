import java.util.*;
public class Hanoi {
    private static int n;
    public static void towerOfHanoi(int n,String src,String helper,String dest ) {
        if(n==1) {
            System.out.println("transfer disk "+ n +" from "+ src +" to "+ dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk " + n + " from " + src+" to "+ dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("find how many possibility of "+n+"tower of hanoi");
        int n = sc.nextInt();
        towerOfHanoi(n,"src","helper","dest");
        
    }
}