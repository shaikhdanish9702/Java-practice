import java.util.Stack;

public class BalanceParathies {
    public static void main(String[] args) {
        String str="{[()]}";
        System.out.println(para(str));
    }
        public static boolean para(String str) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
                continue;
            }
            if(st.isEmpty()){
                return false;
            }
            char check;
            switch (c) {
                case ')':
                check=st.pop();
                if(check=='{' || check=='[')
                    return false;
                    break;
                    case '}':
                    check=st.pop();
                    if(check=='(' || check=='[')
                        return false;
                        break;
                        case ']':
                        check=st.pop();
                        if(check=='{' || check==')')
                            return false;
                            break;
            }

        }
        return st.isEmpty();
    }
}
