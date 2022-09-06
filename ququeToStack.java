import java.util.*;

public class ququeToStack {
    public Stack<Integer> q1=new Stack<Integer>();
    public Stack<Integer> q2=new Stack<Integer>();
    public void push(int x){
        while(!q1.isEmpty()){
            q2.push(q1.pop());
        }
        q1.push(x);
        while(!q2.isEmpty()){
            q1.push(q2.pop());
        }
    }
    public int pop(){
        if(q1.isEmpty()){
            System.out.println("empty");
            return 0;
        }
        int x=q1.peek();
        q1.pop();
        return x;
    }
    public static void main(String[] args) {
        ququeToStack q =new ququeToStack();
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(6);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
