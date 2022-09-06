import java.util.Scanner;
import java.util.Stack;

public class parathesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(parenthesis(s));
	}
	static int parenthesis(String s){
		int n=s.length();
		Stack<Integer> stk=new Stack<>();
		stk.push(-1);
		int res=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='('){
				stk.push(i);
			}
			else{
				if(!stk.empty()){
					stk.pop();
				}
				if(!stk.empty()){
					res=Math.max(res,i-stk.peek());
				}
				else{
					stk.push(i);
				}
			}
		}
		return res;
    }
}
