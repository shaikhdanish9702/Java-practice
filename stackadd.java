public class stackadd {
    static int size=100;
    int arr[]=new int[size];
    int top;
public boolean isEmpty(){
    if(top<0){
        return true;
    }
    return false;
}
    public void push(int x) {
        if(size<=top){
            return;
        }
        else{
            arr[++top]=x;
        }
    }
    public int pop(){
        if(isEmpty()){
            return 0;
        }
        
            int x=arr[top--];
        return x;
    }
    public int peek(){
        return arr[top];
    }
    public static void main(String[] args) {
        stackadd s=new stackadd();
        s.push(8);
        s.push(9);
        System.out.println(s.pop()+" "+s.peek());
    }
}
