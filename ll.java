public class ll { 
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(String data){
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
    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }System.out.println("null");
    }
    public void deletefirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    


    public static void main(String[] args) {
        ll list=new ll();
        list.addfirst("a");
        list.print();
        list.addlast("damish");
        list.print();
        list.addfirst("data");
        list.print();
        list.addlast("data");
        list.print();

        list.deletefirst();
        list.print();
        list.deletelast();
        list.print();
    }
}
