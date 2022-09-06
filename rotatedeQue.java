import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class rotatedeQue {
    public static void main(String[] args) {
        Deque<Integer> deq= new ArrayDeque<Integer>();
        deq.add(1);
        deq.add(4);
        deq.add(16);
        deq.add(0);
        deq.add(9);
        deq.add(8);
        Iterator<Integer> it=deq.iterator();
    while(it.hasNext()){
        System.out.print(it.next()+" ");
    }
    System.out.println();
        int d=1;
        for(int i=0;i<d;i++){
            int val=deq.peekLast();
            deq.pollLast();
            deq.push(val);
    }
    Iterator<Integer> itr=deq.iterator();
    while(itr.hasNext()){
        System.out.print(itr.next()+" ");
    }
}
}
