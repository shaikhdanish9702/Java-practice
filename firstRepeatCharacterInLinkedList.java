import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class firstRepeatCharacterInLinkedList {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            data=data;
            next=null;
        }
    }
    public void push(int data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void display() {
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data+"->");
            curr=curr.next;
        }
        System.err.println("null");
    }

    public int firstRepeat(Node head) {
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        while(head!=null){
            if(mp.containsValue(head.data)){
                mp.put(2,head.data);
            }
            mp.put(1, head.data);
        }
        while(head!=null){
            if(mp.get(head.data)==1){
                return head.data;
            
        }
        
        return -1;
    }

    public static void main(String[] args) {
      firstRepeatCharacterInLinkedList ll= new firstRepeatCharacterInLinkedList();
      ll.push(1);
      ll.display();
    }
}
