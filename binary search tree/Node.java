public class Node {
    public int data;
   public Node right;
   public Node left;
  public  Node(int data){
        this.data=data;
  }
    public void insert(int value) {
        if(data==value)
            return;
        
        if(value<data){
            if(left==null)
                left=new Node(value);
            else
                left.insert(value);
            
        }else if(value>data){
            if(right==null)
                right=new Node(value);
            else
                right.insert(value); 
}
}
public void inorder() {
    if(left!=null)
        left.inorder();
        System.out.print(data+" ");
    if(right!=null)
        right.inorder();
}
public void printOnlyEven() {
    if(left!=null)
        left.printOnlyEven();
        if(data%2==0)
        System.out.print(data+" ");
    if(right!=null)
        right.printOnlyEven();
}
public void preorder() {
    System.out.print(data+" ");
    if(left!=null)
        left.preorder();
        
    if(right!=null)
        right.preorder();
}
public void postorder() {
    if(left!=null)
        left.postorder();
        
    if(right!=null)
        right.postorder();
        System.out.print(data+" ");
}
public int max() {
    if(right==null)
    return data;
    else
    return right.max();
}
public int min() {
    if(left==null)
    return data;
    else
    return left.min();
}
public boolean search(int value) {
    if(value==data)
    return true;
    else if(value<data){
        if(left!=null)
        return left.search(value);
    }else{
        if(right!=null)
        return right.search(value);
        }
    
    return false;
}
}
