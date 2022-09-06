import javax.lang.model.element.Element;

public class ququeS {
int size=100;
 int arr[]=new int[size];
 int front,rear;
 ququeS(){
     front=-1;
     rear=-1;
 } 
 boolean isfull(){
     if(front==0 && rear==size-1){
         return true;
     }
     return false;
 }
 boolean isEmpty(){
     if(front==-1){
         return true;
     }
     return false;
 }
 void push(int x){
     if(isfull()){
         System.out.println("quque is full");
     }else{
         if(front==-1){
             front=0;
         }
             rear++;
             arr[rear]=x;
         
     }
 }
 int pop(){

     if(isEmpty()){
        System.out.println("quque is empty");
        return -1;
     }
         int x=arr[front];
         if(rear==front){
             rear=front=-1;
         }else{
             front=(front+1);
         }
     return x;
 }
 public int peek(){
     return arr[front];
 }
 


    public static void main(String[] args) {
        ququeS q=new ququeS();
        q.push(9);
        q.push(4);
        q.push(6);
        q.push(8);
        q.push(1);
        q.push(3);
    
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}

