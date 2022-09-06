import java.util.HashSet;
import java.util.LinkedList;

public class findTheCycle {
    static boolean remove(Node head){
        HashSet<Node> s= new HashSet<>();
        Node pnode=null;
        Node curr=head;
        while(curr!=null){
            if(s.contains(curr)){
                pnode.next=null;
                return true;
            }else{
                s.add(curr);
                pnode=curr;
                head=head.next;
            }
        }
        curr=head;
        return false;
    }
    static int size(Node head){
        Node curr=head;
        int len=0;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        return len;
    }
}

Queue<Integer> q1=new LinkedList<>();
Queue<Integer> q2=new LinkedList<>();

void push(int n){
    while(!q1.isEmpty()){
        q2.add(q1.remove());
    }
    q1.add(n);
    while(!q2.isEmpty()){
        q1.add(q2.remove());
    }

}
int pop(){
    if(q1.isEmpty()){
        return -1;
    }
    int x=q1.peek();
    q1.pop();
    return x;
}


