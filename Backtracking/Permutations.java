import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Permutations{
    static ArrayList<String> st=new ArrayList<>();
    public static void main(String[] args) {
       int n=4;
       String str="";
       for( int i=1;i<=n;i++){
           str=str+str.valueOf(i);
       }
        String ans="";
        permute(str, ans);
        System.out.println(st.get(5-1));
    }
    public static void permute(String str, String ans) {
        if(str.length()==0){
            st.add(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0, i);
            String right=str.substring(i + 1);
            String res=left+right;
            permute(res, ans+ch);
        }
    }
}
class phone{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       String arr[]=new String[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.next();
       }
       ArrayList<>();
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              char ch=sc.next().charAt(0);
              hm.put(ch,)
          }
      }
       
       }
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    class evenodd{
        static Node head=null;
        public void addlast(int data) {
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }else{
                Node curr=head;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=newNode;
            }
        }
        public void print() {
            if(head==null)
            return;
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }System.out.println();
        }
        public Node deleteNumK(int k) {
            int d=k;
            Node curr=head;
            if(k==0){
                Node temp = head;
        head = head.next;
                return temp;
            }
            k--;
            while(k>0){
                curr=curr.next;
                k--;
            }
            curr.next=curr.next.next;
    
            return curr.next;
        }
        public Node convert(Node head) {
            if(head == null || head.next == null){
                return head;
            }
               Node dummyodd=new Node(-1);
               Node dummyeven=new Node(-1);
               Node taileven=dummyeven;
               Node tailodd=dummyodd;
               Node curr=head;
               int  i=0;
               while(curr!=null){
                   if(i%2==0){
                       taileven.next=curr;
                       taileven=taileven.next;
                   }else{
                    tailodd.next=curr;
                    tailodd=tailodd.next;
                   }
                   curr=curr.next;
                   i++;
               }
               tailodd.next=dummyeven.next;
               taileven.next=null;
               return dummyodd;
           }
       
        public void addKth(int data,int k){
            Node newNode=new Node(data);
            if(k==0){
                Node temp=head;
                head=newNode;
                newNode.next=temp;

            }else{
                Node curr=head;
                k--;
                while(k>0){
                    curr=curr.next;
                    k--;
                }
                Node temp=curr.next;
                curr.next=newNode;
                newNode.next=temp;
            }
        }

        public static void main(String[] args) {
            evenodd ll=new evenodd();
            ll.addlast(1);
            ll.addlast(2);  
            ll.addlast(3);
            ll.addlast(4);
            ll.addlast(5);
            ll.addlast(6);
            ll.addlast(7);
            ll.print();
           ll.convert(head);
           ll.print();
            
        }
    }
