public class queue {
    int front;
    int rear;
    int arr[]=new int[100];
    public void push(int x) {
        if(rear==100-1){
            return;
        }
        arr[rear++]=x;
    }
    public boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        return false;
    }
    public int pop() {
       if(isEmpty()){
return -1;
       }
        int x=arr[front--];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return x;
    }
    public int peek(){
        return arr[0];
    }public static void main(String[] args) {
        queue s=new queue();
        s.push(9);
        s.push(8);
        s.push(4);
        System.out.println(s.pop()+"+"+s.peek());
        
    }
}
