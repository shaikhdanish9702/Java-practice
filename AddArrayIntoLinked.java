public class AddArrayIntoLinked {
    static Node head;
    public static Node insert(Node head,int item) {
        Node temp=new Node(item);
        Node ptr;
        temp.data=item;
        temp.next=null;
        if(head==null){
            head=temp;
        }else{
            ptr=head;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
            
        }
        return head;
    }
    public static void print(Node head) {
        if(head==null){
            System.out.println("empty");
        }else{
            while(head!=null){
                System.out.println(head.data+"->");
                head=head.next;
            }
        }
    }
    public static Node arrNode(int arr[]){
        Node head=null;
        for(int i=0;i<arr.length;i++){
            head=insert(head, arr[i]);
        }return head;
    }
public static void main(String[] args) {
    int arr[]={1,2,34,6,67,9};
    Node head=arrNode(arr);
    print(head);
}    
}
class Node{
    int data;
    Node next;
    Node(int data){
        data=data;
        next=null;
    }
}
