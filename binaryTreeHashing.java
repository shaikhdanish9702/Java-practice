import java.util.*;
import java.util.Map.Entry;
public class binaryTreeHashing {
    private static Set<Entry<Integer, Vector<Integer>>> entrySet;
    private static boolean add;
    static class Node{
        int key;
        Node left;
        Node right;
        Node(int data){
            key=data;
            left=null;
            right=null;
        }
    }
    static void getverticalOrder(Node root,int hd,TreeMap<Integer,Vector<Integer>> m){
        if(root==null)
        return;
        Vector<Integer> get=m.get(hd);
        if(get==null){
            get=new Vector<>();
            add = get.add(root.key);
        }
        else
            get.add(root.key);
        m.put(hd,get);
        getverticalOrder(root.left,hd-1,m);
        getverticalOrder(root.right,hd+1,m);

    }
    static void  printv(Node root){
        TreeMap<Integer,Vector<Integer>> m=new TreeMap<>();
        int hd=0;
        getverticalOrder(root,hd,m);
        entrySet = m.entrySet();
        for(Entry<Integer,Vector<Integer>> entry:entrySet)
        {
            System.out.println(entry.getValue());
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.right.left=new Node(8);
        root.right.left.left=new Node(9);
        printv(root);
    }
}
