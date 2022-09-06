import java.util.*;

public class function {
    public static void main(String[] args) { 
        int n ;
        int count=0;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++) 
        {
            if(n%i==0) 
            {
                int f= n/i;
                if(i==f)
                count = count+1;
                else
                count = count+2;
            }
        }
        System.out.println(count);
    }   
    
}

// 1
// 2
// 4
// 7
// 8
// 14
// 16
// 28
// 29
// 56
// 58
// 116
// 203
// 232
// 406
// 464
// 812
// 1624

