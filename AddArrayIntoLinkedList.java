import java.*;
public class AddArrayIntoLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
    }
        // Node(){
        //     this.data=data;
        //     this.next=null;
        // }
        // Node(int data){
        //     this.data=data;
        //     this.next=null;
        // }
    
    public static Node add(Node head,int x){
        Node newNode=new Node();
        newNode.data= x;
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static Node arr(int arr[]){
        head=null;
        for(int i=arr.length-1;i>=0;i--)
            head=add(head, arr[i]);
            return head;
    }
    public static void print(Node root) {
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,43,5,7};
        Node root=arr(arr);
        print(root);

    }
}
