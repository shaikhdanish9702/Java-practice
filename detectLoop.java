public class detectLoop {
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two=new Node(10);
        Node three=new Node(20);
        Node four=new Node(10);
        Node five=new Node(2);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=one;
        boolean op=loop(one);
        System.out.println(op);
    }
    public static boolean loop(Node head) {
        Node turtle=head;
        Node hair=head;
        while(turtle!=null && hair!=null && hair.next!=null){
            turtle=turtle.next;
            hair=hair.next.next;
            if(turtle==hair){
                return true;
            }
        }
        return false;
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
