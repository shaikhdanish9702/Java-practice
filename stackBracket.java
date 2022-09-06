import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class stackBracket {
public static void main(String[] args) {
    String s="{[()]()}";
        if(Bracket(s)){
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }
}

    public static boolean Bracket(String s) {
        Deque<Character> st=new ArrayDeque();
    for(int i=0;i<s.length();i++){
        char x=s.charAt(i);
        if(x=='{' || x=='[' || x=='('){
            st.push(x);
            continue;
        }
        if(s.isEmpty())
            return  false;
        char check;
        switch(x) {
            case ')':
            check=st.pop();
            if(check=='}' || check==']')
                return false;
            break;
                case '}':
                check=st.pop();
                if(check==')' || check==']')
                    return false;
break;
                    case ']':
                    check=st.pop();
                    if(check=='}' || check==')')
                        return false;
    break;
                    
            }
        }
        return (st.isEmpty());
    }  
    
}    

