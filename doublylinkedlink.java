import javafx.scene.layout.VBoxBuilder;

public class doublylinkedlink {
    class DLL{
        Node head;
        public void insertfirst(int val) {
            Node node=new Node(val);
            node.next=head;
            node.prev=null;
            if(head!=null){
                head.prev=node;
            }
            head=node;
        }
        // public void printlist(){
        //     Node node= head;
        //     while(node!=null){
        //         System.out.println(node.val+"<->");
        //         node=node.next;
        //     } System.out.println("end");

        // }
        public void printlist(){
            Node node= head;
            Node last=null;
            while(node!=null){
                System.out.println(node.val+"<->");
                last=node;
                node=node.next;
            } System.out.print("end");
           // System.out.println("print in reverse");
            while(last!=null){
                System.out.print(last.val+"->");
                last=last.prev;
            }System.out.println();

        }
        class Node{
            int val;
            Node next;
            Node prev;
            public Node(int val){
                this.val=val;
            }
            public Node(int val,Node next,Node prev){
                this.val=val;
                this.next=next;
                this.prev=prev;
            }
        }
    }
    public static void main(String[] args) {
        doublylinkedlink list=new doublylinkedlink();
        list.insertfirst(2);
        list.insertfirst(7);
        list.insertfirst(5);
        list.insertfirst(100);
        list.printlist();
        
    }
}
