public class AnyWhereLinkedList extends linkedlist {

    static Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    public void addfirst(int x){
        Node newnode=new Node(x);
        if(isEmpty()){
            head=newnode;
            return;
        }
        head=newnode;
        newnode.next=head;
        size++;
    }
    public void Addany(int x, int pos) {
        Node newnode=new Node(x);
        // if(isEmpty()){
        //     System.out.println("linkedlist is empty that means your position");
        //     return;
        // }
        if(pos==0){
            addfirst(x);
            return;
        }
        if(pos==size){
            addlast(x);
            return;
        }
            Node curr=head;
            while(pos!=0){
                curr=curr.next;
                pos--;
            }
            Node temp=curr.next;
            curr.next=newnode;
            newnode.next=temp;
            size++;
        
        
    }
    public void printli(){
        Node prev=head;
        while(prev!=null){
            System.out.println(prev.data);
            prev=prev.next;
        }
    }
    public static void main(String[] args) {
        AnyWhereLinkedList ll=new AnyWhereLinkedList();
      ll.Addany(1, 0);
      ll.Addany(2, 1);
        ll.printLinkedlist();
    }
}
