public class remove {
    Node head;
    Node tail;
    int size;
    public remove(){
        this.size=0;
    }
    class Node {
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value , Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void insertfirst(int val) {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
        
    }
    public void insertlast(int val) {
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
        
    }
    public void insert(int val,int index) {
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node= new Node(val, temp.next);
        temp.next=node;
        size++;
        
    }
    public int deletefirst(){
        int val=head.value;
        head =head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public Node get(int index) {
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deletelast() {
        if(size<=1){
            return deletefirst();
        }
        Node secondlast= get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        size--;
        return val;
          
        
    }
    public int deleteanynode(int index){
        if(index==0){
            return deletefirst();
        }if(index==size-1){
            return deletelast();
        }
        Node secondlast=get(index-1);
        int val=secondlast.next.value;
        secondlast.next=secondlast.next.next;
        return val;
    }
    public void display() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("end");
        
    }
    public static void main(String[] args) {
        remove list=new remove();
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertlast(9);
       list.insert(1, 2);
        list.display();
        list.deletefirst();
        list.display();
        list.deletelast();
        list.display();
        list.deleteanynode(1);
        list.display();
}
}
