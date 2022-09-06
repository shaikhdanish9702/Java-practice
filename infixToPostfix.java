import java.util.Stack;

import org.omg.CORBA.StringHolder;

public class infixToPostfix {
    public static void main(String[] args) {
        String str="a*(b+c)-d";
        System.out.println(Infix(str));
    }
    public static int prec(char ch) {
        switch(ch){
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
        }
        return -1;
    }
    public static String Infix(String str) {
        String result="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();++i){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                result+=c;
            }else if(c=='('){
                st.push(c);
            }else if(c==')'){
                while(!st.isEmpty() && st.peek() !='('){
                    result+=st.pop();
                }
                st.pop();
            }else{
                while(!st.isEmpty() && prec(c)<=prec(st.peek())){
                    result+=st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            if(st.peek()=='('){
                return "invalid";
            }
            result+=st.pop();
        }
        return result;
    }
}
