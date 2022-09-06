public class practice2 {
    Node head;

    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next) {
            this.value=value;
            this.next=next;
        }
    }
    public void first(int value) {
        Node newnode=new Node(value);
        newnode.next=head;
        head=newnode;
        
    }
    public void printlist(){
        Node newnode=head;
        while(newnode!=null){
            System.out.print(newnode.value+"-->");
            newnode=newnode.next;
        }
    }
    public static void main(String[] args) {
        practice2 ll= new practice2();
        ll.first(2);
        ll.printlist();
    }
}
