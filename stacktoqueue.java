import java.util.Queue;

public class stacktoqueue {
    stacktoqueue(){

    }
    public Queue<Integer> q1=new Queue<Integer>();
    public Queue<Integer> q2=new Queue<Integer>();
    // q1 5,1,2,3,4
    // q2 1,2,3,4
    public void push(int x){
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }

        }
        public int pop() {
            if(q1.isEmpty()){
                System.out.println("empty");
            }else{
                int x=q1.peek();
                q1.poll();
            }
            return x;
        }
    public static void main(String[] args) {
        
    
        stacktoqueue s = new stacktoqueue();
        s.push(6);
        s.push(9);
        System.out.println(s.pop());
    }
}
