
public class reverseMddle {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            data=data;
            next=null;
        }
    }
    public static void main(String[] args) {

      reverseMddle ll=new reverseMddle();
      ll.push(1);
      ll.push(2);
      ll.push(3);
      ll.push(4);
      ll.push(5);
      ll.push(6);
      ll.push(7);
      ll.push(8);
    //   ll.head=ll.reverse(ll.head, 2);
      ll.print();
    }
    Node push(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node curr= head;
            while(curr.next!=null)
            curr=curr.next;
            curr.next=newnode;
        }
        return head;
    }
    
    //  Node reverse(Node head,int k){
    //      if(head==null)
    //          return null;
         
    //     Node curr=head;
    //     Node pnode=null;
    //     Node prev=null;
    //     int count=0;
    //     while(count< k && curr!=null){
    //         pnode=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=pnode;
    //         count++;
    //     }
    //     if(pnode!=null)
    //     head.next=reverse(pnode, k);
    //     return prev;
    // }
     void print(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
    }
}

