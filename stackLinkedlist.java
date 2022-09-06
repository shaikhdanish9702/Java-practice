import javafx.scene.Node;

public class stackLinkedlist {
    stack head;
    static class stack{
        int data;
        stack next;
        stack(int data){
            this.data=data;
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void push(int data){
        stack newnode=new stack(data);
        stack temp=head;
        head=newnode;
        newnode.next=temp;
        System.out.println(data);
    }
    public int pop(){
        int x=Integer.MIN_VALUE;
        if(isEmpty()){
            System.out.println("stack is empty");
        }else{
            x=head.data;
            head=head.next;
        }
        return x;
    }
    public int peek(){
        if(isEmpty()){
            return 0;
        }
       return head.data;
    }
   

    public static void main(String[] args) {
        stackLinkedlist s=new stackLinkedlist();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        
        System.out.println(s.peek());

    }
}
