import java.util.Scanner;

public class loop {
    public static void loop(int num) {
        if(num==50){
            return;
        }
        System.out.print(num+" ");
        loop(num+5);

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        loop(num);
    }

}
