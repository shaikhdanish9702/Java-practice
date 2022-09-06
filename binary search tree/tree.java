public class tree {
    Node root;
    public void insert(int value) {
        if(root==null)
            root=new Node(value);
        else
            root.insert(value);
        
    }
    public void inorder() {
        if(root!=null)
        root.inorder();
    }
    public void preorder() {
        if(root!=null)
        root.preorder();
    }
    public void postorder() {
        if(root!=null)
        root.postorder();
    }
    public int size(Node root){
        if(root==null)
        return 0;
        return size(root.left)+1+size(root.right);
    }
    public int size(){
        return size(root);
    }
    public boolean search(int value){
        if(root!=null)
        return root.search(value);
        throw new RuntimeException("Cannot perform search in  an empty tree");
    }
    public int max() {
        return root.max();
    }
    public int min() {
        return root.min();
    }
public int sum(Node root ,int max) {
    if(root==null){
        return 0;
    } 
    if(max==1)
    return root.data;
    return sum(root.left,max-1) + sum(root.right,max-1)+root.data;
}
public int sum(Node root) {
    int max=Maxdepth(root);
    return sum(root,max);
}
public int sum() {
    return sum(root);
}
public int Maxdepth(Node root) {
    if(root==null)
    return 0;
    return 1+Math.max(Maxdepth(root.left), Maxdepth(root.right));
}
public int Maxdepth() {
    return Maxdepth(root);
}
public Node delete(Node root,int data) {
    if(root==null)
    return root;
    if(data>root.data)
    root.right=delete(root.right, data);
    else if(data<root.data)
    root.left=delete(root.left, data);
else{
    if(root.left==null)
    return root.right;
    else if(root.right==null)
    return root.left;
    else{
        root.data=Minvalue(root.right);
        root.right=delete(root.right, root.data);
    }
}
    return root;
}
public void delete(int data) {
    root=delete(root, data);
}
public int Minvalue(Node root) {
    int min=root.data;
    while(root.left!=null){
        min=root.left.data;
        root=root.left;
    }
    return min;
}
public void printOnlyEven() {
    if(root!=null)
    root.printOnlyEven();
}
}
 class driver{
     public static void main(String[] args) {
        tree intTree = new tree();
                intTree.insert(25);
                intTree.insert(22);
                intTree.insert(29);
                intTree.insert(21);
                intTree.insert(37);
                intTree.insert(28);
                intTree.insert(31);
                intTree.postorder();
                System.out.println();
                intTree.delete(25);
                intTree.postorder();
                
     }
 }
