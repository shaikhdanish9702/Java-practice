import java.util.Stack;

public class pairHate {
    public static void main(String[] args) {
        String str="hhhhoooowwwwre";
        Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(st.contains(str.charAt(i))){
                st.remove(str.charAt(i));
            }
            else if(!st.contains(str.charAt(i))){
                st.add(str.charAt(i));
            }
        }
      System.out.println(st);

    }
}
