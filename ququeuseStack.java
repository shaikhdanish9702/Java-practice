import java.*;
public class ququeuseStack {
    // pop
    //q2-
    //q1- 6 5 4 3 2 1
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int n)
    {
        q2.add(n);
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
        }
    }

    int pop()
    {
        if(q1.isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    public static void main(String[] args)
    {
        ququeuseStack stack=new ququeuseStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}