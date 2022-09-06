import java.rmi.registry.Registry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class Practicechalenge{
public static void main(String[] args) {
    int arr[]={0,1,0,0,0,1,0};
    int k=1;
    System.out.println(maxsubsetSize(arr, k));

}
static int maxsubsetSize(int arr[],int k){
    int ptr=0;
    HashSet<Integer> s=new HashSet<>();
    int currsum=0;
    for(int i=0;i<arr.length;i++){
        currsum+=arr[i];
        if(currsum<k){
            continue;
        }
        if(currsum>k){
            while(currsum>k){
                currsum-=arr[ptr++];
            }
        }
        if(currsum==k){
            s.add(i-ptr+1);
            int t=ptr;
            while(arr[t]==0){
                s.add(i-t);
                t++;
            }
        }
    }
    return s.size();
}
}


class sortedRotated{
    public static void main(String[] args) {
    int arr[]={4,5,6,7,8,1,2,3};
    int k=3;
    int l=0;
    int r=arr.length-1;
    System.out.println(binaryroatedsearch(arr, k, l, r));
    }
    static int binaryroatedsearch(int arr[],int k,int l,int r){
        if(l>r){
            return -1;
        }
        int mid=l+(r-l)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(k>=arr[l] && k<=arr[mid])
            return binaryroatedsearch(arr, k, l, mid-1);
                return binaryroatedsearch(arr, k, mid+1, r);

    }
}
class countOccurrences{
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,3,3,4,5,6};
        int k=6;
       
   int start=findOccurences(arr, k, false);
   int end=findOccurences(arr, k, true);
   System.out.println("("+start+" "+end+")");
    }
    static int findOccurences(int arr[],int k,boolean findLAst){
        int ans=-1;
        int l=0;
    int r=arr.length-1;
    while(l<=r){
    int mid=l+(r-l)/2;
    if(k<arr[mid]){
        r=mid-1;
    }else if( k>arr[mid]){
        l=mid+1;
    }else{
        ans=mid;
        if(findLAst){
            l=mid+1;
        }else{
            r=mid-1;
        }
    }
    }
    return ans;
}
}
class binaryLessEqual{
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,3,3,4,6};
        int k=5;
       
   System.out.println(binaryLessEqal(arr, k));

    }static int binaryLessEqal(int arr[],int k){
        int count=-1;
        int l=0;
        int r=arr.length-1;
        while(l<r){
        int mid=l+(r-l)/2;
        if(k>=arr[mid]){
         count=mid+1;
            l=mid+1;
        }else{
            r=mid-1;
        }
    }
    return count;
    }

}
class findProductOfTriple{
    public static void main(String[] args) {
        int arr[]={6,6,1,2,3,2,6};
System.out.println(maxProduct(arr));

    }
    static int maxProduct(int arr[]){
        int maxA=Integer.MIN_VALUE;
        int maxB=Integer.MIN_VALUE;
        int maxC=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxA){
                maxC=maxB;
                maxB=maxA;
                maxA=arr[i];
            }else if(arr[i]>maxB){
                maxC=maxB;
                maxB=arr[i];
            }else{
                maxC=arr[i];
            }
        }
        return maxA*maxB*maxC;
    }
}

class count{
    public static void main(String[] args) {
        int arr[]={ 1,2,3,2,3,4,5,6,3,6 };
        int k=4;
        count(arr, k);

    }
    static void count(int arr[],int k){

        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<k;i++){
            h.put(arr[i], h.getOrDefault(arr[i],0 )+1);
    }
            System.out.print(h.size()+" ");
            for(int i=k;i<arr.length;i++){
                if(h.get(arr[i-k])==1){
                    h.remove(arr[i-k]);
                }else{
                    h.put(arr[i-k], h.get(arr[i-k])-1);
                }
                h.put(arr[i], h.getOrDefault(arr[i],0)+1);

                System.out.print(h.size()+" ");
            }
        
    }
}

// The count of distinct elements in subarray { 2, 1, 2, 3, 2 } is 3
class longestCommonPrefix{
    public static void main(String[] args) {
        String arr[]={"geeksforgeeks","geeks","geek","geezer"};
        System.out.println(longestString(arr));
    }
    static String longestString(String []a){
        int size=a.length;
        if(size==0){
            return "";
        }
        if(size==1){
            return a[0];
        }
        Arrays.sort(a);
        int end=Math.min(a[0].length(), a[size-1].length());
        int i=0;
        while(i<end && a[0].charAt(i)==a[size-1].charAt(i))
        i++;
        String pre=a[0].substring(0, i);
        return pre;

    }
}
class gfg{
class Node{
    int data;
    Node next;

}
static Node head=null;
    public void addLast(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=head;
        head=newnode;
    }
    public void printList(){
        if(head==null)
        return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public Node sortNode(Node a,Node b){
        if(a==null)
        return b;
        if(b==null)
        return a;
        if(a.data<b.data){
            a.next=sortNode(a.next, b);
            return a;
        }else{
            b.next=sortNode(a, b.next);
            return b;
        }
    } 

    public static Node reverse(Node head,int k){
        Stack<Node> st=new Stack<>();
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            int count=0;
            while(curr!=null && count<k){
                st.push(curr);
                curr=curr.next;
                count++;
            }
            while(st.size()>0){
                if(prev==null){
                    prev=st.peek();
                    head=prev;
                    st.pop();
                }else{
                    prev.next=st.peek();
                    prev=prev.next;
                    st.pop();
                }
            }
        }
        prev.next=null;
        return head;
    }
    public static void main(String[] args) {
        gfg list1=new gfg();

        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);
        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(6);
        list1.addLast(7);
        list1.addLast(8);
        list1.addLast(9);
        head=reverse(head, 3);
        // list1.head=new mergek().mergNode(list1.head, list2.head);
        list1.printList();

}
}
class mergek{
    public Node mergNode(Node head1,Node head2){
        Node dummyNode=new Node(0);
        Node tail=dummyNode;
        while(true){
            if(head1==null){
                tail.next=head2;
                break;
            }
            if(head2==null){
                tail.next=head1;
                break;
            }
            if(head1.data<=head2.data){
                tail.next=head1;
                head1=head1.next;
            }else{
                tail.next=head2;
                head2=head2.next;
            }
            tail=tail.next;
        }
        return dummyNode.next;
    }
}
class prevgreater{
    public static void main(String[] args) {
        int arr[]={10,4,2,20,40,12,30};
        int =arr.length;
        geezer(arr, n);
    }
    static void geezer(int arr[],int n){
System.out.print(-1+" ");
Stack<Integer> s= new Stack<>();
s.push(arr[0]);
for(int i=0;i<n;i++){
    while(s.isEmpty()==false && s.peek()<arr[i])
    s.pop();

    if(s.isEmpty()==true)
    System.out.print("-1, ");
    else
    System.out.print(s.peek()+", ");
    s.push(arr[i]);
}
    }
}
class revString{
    public static void main(String[] args) {
        String str="danish";
        System.out.println(rev(str.toCharArray(), 0, str.length()-1));
    }
    static String rev(char[]str,int l,int r){
        while(l<r){
            str[l] ^= str[r];
            str[r] ^= str[l];
            str[l] ^= str[r];
            ++l;
            --r;
        }
        return String.valueOf(str);
    }
}
class MyNode
{
    int data;
    MyNode next;
    MyNode(int d)
    {
        data = d;
        next = null;
    }
}
class MgmtLinkedLIst
{
    public static void main(String ar[])
    {
        MyNode head1, head2, tail1,tail2;
        head1 = head2 = null;
        tail2 = tail1 = null;
        tail1 = head1  = addNode(tail1, 25);
        tail1 = addNode(tail1, 35);
        tail1 = addNode(tail1, 45);
        tail1 = addNode(tail1, 65);
        tail1 = addNode(tail1, 85);

        tail2 = head2 = addNode(tail2, 10);
        tail2 = addNode(tail2,15);
        tail2 = addNode(tail2,20);
        tail2 = addNode(tail2,38);
        tail2 = addNode(tail2,55);
        tail2 = addNode(tail2,75);

        displayNode(head1);
        displayNode(head2);

        MyNode nodelst = mergeNode(head1,head2);
        System.out.println("Merge List: ");
        displayNode(nodelst);
    }
    static MyNode addNode(MyNode mnode, int n)
    {
        MyNode qnode;
        if( mnode == null)
        {
            mnode = new MyNode(n);
            return mnode;
        }
        qnode = new MyNode(n);
        mnode.next = qnode;
        return qnode;
    }
    static void displayNode(MyNode p)
    {
        if( p == null)
        {
            System.out.println("No Node in the list");
            return ;
        }
        while( p != null)
        {
            System.out.print(p.data+" ");
            p = p.next;
        }
        System.out.println("");
    }
    static MyNode mergeNode(MyNode h1, MyNode h2)
    {
        if( h1 == null && h2 == null)
        {
            System.out.println("Both of the lists Are No Nodes");
            return null;
        }

        MyNode p, q , head_ref ;
        p =  q = head_ref = null;

        if( h1 != null && h2 != null)
        {
            if( h1.data < h2.data ) {
                head_ref = h1;
                h1 = h1.next;
            }
            else {
                head_ref = h2;
                h2 = h2.next;
            }
        }
        else
        {
            if( h1 != null)
                return h1;
            else
                return h2;
        }


        p = head_ref;
        while( h1 != null && h2 != null )
        {
            if(h1.data < h2.data)
            {
                q = new MyNode(h1.data);
                p.next =  q;
                h1 = h1.next;
                p = q ;
            }
            else {
                q = new MyNode(h2.data);
                p.next = q;
                p = q;
                h2=h2.next;
            }
        }
        if(h1 == null )
        {
            while( h2 != null)
            {
                q = new MyNode(h2.data);
                p.next = q;
                p = q ;
                h2 = h2.next;
            }
        }
        else
        {
            while(h1 != null ) {
                q = new MyNode(h1.data);
                p.next = q;
                p = q;
                h1 = h1.next;
            }
        }
        return head_ref;
    }

}
class remove{
    public static void main(String[] args) {
        Node one=new Node(1);
        Node two =new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=one;
        boolean detect=detectAndRemoveLoop(one);
        if(detect){
            System.out.println("loop found");
        }else{
            System.out.println("loop didn't find");
        }

    }
    public static boolean detectAndRemoveLoop(Node head){
        HashSet<Node> s= new HashSet<>();
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
}
class Node{
    int data;
    Node next;
    Node(int data){
        data=data;
        next=null;
    }
}
class  parentheses{
    public static void main(String[] args) {
        String str=" (()(()()";
        int x=str.length();
        System.out.println(parathesescount(str, x));
    }
    public static int parathesescount(String str,int x){
        int arr[]=new int[x/2+1];
        int y=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
            st.push(i);
            }else{

            if(!st.isEmpty()){
            st.pop();
        }
        if(!st.isEmpty()){
        y=Math.max(y,i-st.peek());
        }
    else{
        st.push(i);
    }
}

}
return y;
    }
}

