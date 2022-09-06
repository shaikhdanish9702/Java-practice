import javafx.scene.NodeBuilder;

public class linkedlist {
   
    static int size=1;
    Node head;
    class Node{
        int data;
        Node next;
        Node(){
            this.data=data;
            this.next=null;
        }
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty() {
        if(head==null || head.next==null){
            return true;
        }
        return false;

    }
    public void addfisrt(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        size++;
    }
    public void addlast(int x){
        Node newnode=new Node(x);
        if(head==null){
            head=newnode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnode;
        size++;
    }
    
    public void printLinkedlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node newnode=head;
        while(newnode!=null){
            System.out.print(newnode.data+ "->");
            newnode=newnode.next;
        }System.out.print("null");
        System.out.println();
    }
    public Node deletefirst(){
        if(isEmpty()){
            System.out.println("out bound");
            return null;
        }
        head=head.next;
        size--;
        return head;
    }
    public Node deletelast(){
        if(isEmpty()){
            System.out.println("out bound");
            return null;
        }
        if(head.next==null){
            head.next=null;
            return null;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        size--;
        return head;
    }
    public void addanywhere(int x,int pos){
        Node newnode= new Node(x);
        if(isEmpty()){
            System.out.println("invalid");
            return;
        }
        if(pos==0){
            addfisrt(x);
            return;
        }
        if(pos==size){
            addlast(x);
            return;
        }
        Node curr=head;
        while(pos!=1){
            curr=curr.next;
            pos--;
        }
        Node temp=curr.next;
        curr.next=newnode;
        newnode.next=temp;
        size++;
    }
    public Node  deleteAnyNode(int pos){
        if(isEmpty()){
            System.out.println("invalid");
            return null;
        }
        if(pos>size){
            return null;
        }
        if(pos==0){
            deletefirst();
            return head;
        }
        if(pos==size){
            deletelast();
            return head;
        }
        Node curr=head;
        while(pos!=1){
            curr=curr.next;
            pos--;
        }
        curr.next=curr.next.next;
        size--;
        return head;
    }
    // 0->1->2->6->9->null
  //      
  
    public void addpositionfromlast(int x,int pos){
       Node newnode=new Node(x);
        if(isEmpty()){
            return;
        }if(pos==size){
            addfisrt(x);
            return;
        }if(pos==0){
            addlast(x);
            return;
        }
        Node curr=head;
        while(pos>0){
            pos--;
            curr=curr.next;
        }
        Node prev=head;
        while(curr!=null){
            curr=curr.next;
            prev=prev.next;
        }
        Node temp=prev.next;
        prev.next=newnode;
        newnode.next=temp;
        size++;
    }
    public Node reversNode(){
        if(isEmpty()){
            return head;
        }
        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head.next=null;
        head=prev;
        return head;
    }
    public Node deleteAnywhere(int pos){
        if(isEmpty()){
            return head;
        }
        Node curr=head;
        while(pos>0){
            pos--;
            curr=curr.next;
        }
        Node prev= head;
        while(curr!=null){
            prev=prev.next;
            curr=curr.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static Node mergNode(Node head1,Node head2){
        Node dummy= new Node();
        Node tail=dummy;
       while(true){
           if(head1==null){
               tail.next=head2;
               break;
           }
           if(head2==null){
               tail.next=head1;
               break;
           }
           if(head1.data<=head2.data){
               tail.next=head1;
               head1=head1.next;
           }else{
            tail.next=head2;
            head2=head2.next;

           }tail=tail.next;
       }return dummy.next;

    }
    public void palindrome() {
        
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        linkedlist pl=new linkedlist();
        ll.addlast(1);
        ll.addlast(3);
        ll.addlast(5);
        ll.addlast(7);
        ll.addlast(9);
        pl.addlast(2);
        pl.addlast(4);
        pl.addlast(6);
        pl.addlast(8);
        ll.head=mergNode(ll.head, pl.head);
    }
}
