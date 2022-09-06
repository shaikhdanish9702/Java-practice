import javafx.scene.Node;

public class NumRev {
    public static void main(String[] args) {
        int x=1234;
        System.out.println(rev(x)); 
    }
    static int rev(int x){
        int rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return rev;
    }
}
