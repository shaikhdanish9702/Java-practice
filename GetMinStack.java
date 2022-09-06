import java.util.Stack;

public class GetMinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> aux=new Stack<>();
    public void push(int val){
        s.push(val);
        if(aux.isEmpty()){
            aux.push(val);
        }else{
            if(aux.peek()>=val)
            aux.push(val);
        }
    }
    public int pop(){
        if(s.isEmpty()){
            return -1;
        }
        int top=s.pop();
        if(top==aux.peek())
        aux.pop();
        return top;
    }
    public int getMin(){
        if(aux.isEmpty()){
            return -1;
        }
        return aux.peek();
    }

    public static void main(String[] args) {
        GetMinStack s= new GetMinStack();
        s.push(6);
        System.out.println(s.getMin());    // prints 6
 
        s.push(7);
        System.out.println(s.getMin());    // prints 6
 
        s.push(8);
        System.out.println(s.getMin());    // prints 6
 
        s.push(5);
        System.out.println(s.getMin());    // prints 5
 
        s.push(3);
        System.out.println(s.getMin());    // prints 3
 
        System.out.println(s.pop());    // prints 3
        System.out.println(s.getMin());    // prints 5
 
        s.push(10);
        System.out.println(s.getMin());    // prints 5
 
        System.out.println(s.pop());    // prints 10
        System.out.println(s.getMin());    // prints 5
 
        System.out.println(s.pop());    // prints 5
        System.out.println(s.getMin());    // prints 6

    }

}
