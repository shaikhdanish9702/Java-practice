import java.util.*;

public class palindromeLinked {
   
    static boolean isPalindrome(Node head){
        Node slow=head;
        Boolean ispalin= true;
        Stack<Integer> st=new Stack<Integer>();
        while(slow!=null){
            st.push(slow.data);
            slow=slow.next;
        }
        while(head!=null){
            int i=st.pop();
            if(head.data==i){
                ispalin=true;
            }else{
                ispalin=false;
                break;
            }
            head=head.next;
        }
        return ispalin;
    }
    public static Node add(Node f,Node s){
        Node head=null;
        Node temp=null;
        int carry=0;
        while(f!=null || s!=null){
            int sum=carry;
            if(f!=null){
                sum+=f.data;
                f=f.next;
            }
            if(s!=null){
                sum+=s.data;
                s=s.next;
            }
            Node newnode=new Node(sum%10);
            carry=sum/10;
            if(temp==null){
                temp=head=newnode;
            }else{
                temp.next=newnode;
                temp=temp.next;
            }
        }
        if(carry>0){
            temp.next=new Node(carry);
        }
        return head;
    }
    public static void main(String[] args) {
       Node one=new Node(1);
       Node two=new Node(998); 
       Node three=new Node(7);
       Node four=new Node(3);
       Node five=new Node(7);
       Node six=new Node(998);
       Node seven=new Node(100);
       Node eight=new Node(18);
       one.next=two;
       two.next=three;
       three.next=four;
       four.next=five;
      
       five.next=six;
       six.next=seven;
       seven.next=eight;
       add(one, five);

    //    removeLoop(one);
    //    print(one);
    //    one=rev(one);
    duplicateUnsorted(one);
       print(one);
    //    System.out.println(condition);

    }
    
    public static boolean removeLoop(Node head) {
        HashSet<Node> s=new HashSet<Node>();
        Node prev=null;
        while(head!=null){
            if(s.contains(head)){
                prev.next=null;
                return true;
            }else{
                s.add(head);
                prev=head;
                head=head.next;
            }
        }
        return false;
    }
    public static boolean cicular(Node head) {
        Node slow=head;
        Node fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    static void duplicates(Node head){
        Node curr=head;
        while(curr!=null){
            Node temp=curr;
            while(temp!=null &&temp.data==curr.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }

    }
    static void duplicateUnsorted(Node head){
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
        while(ptr1!=null && ptr1.next!=null){
            ptr2=ptr1;
            while(ptr2.next!=null){
                if(ptr1.data==ptr2.next.data){
                    ptr2.next=ptr2.next.next;
                    System.gc();
                }else{
                    ptr2=ptr2.next;
                }
            }
            ptr1=ptr1.next;
        }
    }
    static Node rev(Node head){
        Node prev=null;
        Node curr=head;
        Node pNode= null;
        while(curr!=null){
            pNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=pNode;
        }
        head=prev;
        return head;  
    }
    static void print(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        next=null;
        data=d;
    }
}
class maxProfi{
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    } 
      public static int maxProfit(int[] prices) {
       int max=-1;
       int min=0;
       for(int i=0;i<prices.length;i++){
           if(prices[min]>prices[i]){
               min=i;
           }
           max=Math.max(prices[i]-prices[min],max);
    }
       return max;
    }
}
