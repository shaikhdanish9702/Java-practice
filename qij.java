import java.util.LinkedList;
import java.util.Queue;

public class qij {
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2= new LinkedList<>();
    void push(int n){
        q2.add(n);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    int pop(){
        if(q1.isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return q1.remove();
    }



    public static void main(String[] args) {
        qij st=new qij();
        st.push(1);
        st.push(2);
        System.out.println(st.pop());
    }
}
