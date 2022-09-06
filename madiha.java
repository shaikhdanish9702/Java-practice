import java.util.*;
public class madiha {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		int a =sc.nextInt();
		boolean flag=false;
		for(int j=2;j<a;j++) {
			if(a%j==0) {
				flag=true;
			}
		}
		if(!flag)
		System.out.println("YES");
		else {
			System.out.println("NO");
		}
	} 
    }
}
