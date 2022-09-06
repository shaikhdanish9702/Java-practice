public class stackImplimentation {
    static final int max=100;
    int top;
    int arr[]=new int[max];
    boolean isEmpty(){
        return (top<0);
    } 
    stackImplimentation(){

    }
    public void push(int x){
        if(top>=(max-1)){
            System.out.println("stack overflow");
            return;
        }else{
            arr[++top]=x;
            System.out.println(x+" push");
            return;
        }
    }
    public int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=arr[top--];
            return x;
        }
    }
    public int peek(){
        if(top<0){
            System.out.println("empty stack");
            return 0;
        }else{
            int x=arr[top];
            return x;
        }
    }
    public void print(){
        for(int i=top;i>0;i--){
            System.out.println(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        stackImplimentation stk=new stackImplimentation();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
        stk.print();
        stk.pop();
        stk.print();
        System.out.println(stk.peek());
        
    }
}
