import java.sql.RowId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {
    public static node root;
    static node temp = root;

    // public static boolean flag = false;
    static void insert(node temp, int key) {
        if (temp == null) {
            root = new node(key);
            return;
        }
        Queue<node> q = new LinkedList<node>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null) {
                temp.left = new node(key);
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }
    }

    private static boolean serach(node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        boolean res = serach(root.left, data);
        if (res)
            return true;
        boolean res2 = serach(root.right, data);
        return res2;
    }

    public static void inorder(node temp) {
        if (temp == null) {
            return;
        }
        inorder(temp.left);
        System.out.println(temp.data + " ");
        inorder(temp.right);
    }

    static boolean isBst(node root, int max, int min) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return (isBst(root.left, max, root.data - 1) && isBst(root.right, root.data + 1, min));
    }

    public static void postorder(node temp) {
        if (temp == null) {
            return;
        }
        System.out.println(temp.data + " ");
        inorder(temp.left);
        inorder(temp.right);

    }

    private static int daimeter(node root) {
        if (root == null) {
            return 0;
        }
        int lh = high(root.left);
        int rh = high(root.right);
        int ld = daimeter(root.left);
        int rd = daimeter(root.right);
        return 1 + Math.max(lh + rh, Math.max(ld, rd));
    }

    static int high(node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(high(root.left), high(root.right));
    }

    static void binaryserach(node root, int data) {
        if (root == null) {
            root = new node(data);
            return;
        }
        if (root.data > data) {
            binaryserach(root.left, data);
        }
        if (root.data < data) {
            binaryserach(root.right, data);
        }
    }

    static int maxvalue = 0;

    static void leftmost(node root, int max) {
        if (root == null) {
            return;
        }
        if (maxvalue < max) {
            System.out.println(root.data);
            maxvalue = max;
        }
        leftmost(root.right, max + 1);
        leftmost(root.left, max + 1);

    }

    static void leftview() {
        maxvalue = 0;
        leftmost(root, 1);
    }

    static int countNode(node root) {
        if (root == null) {
            return 0;
        }
        return root.data + countNode(root.left) + countNode(root.right);
    }

    public static void sol(node root, ArrayList<Integer> ans) {
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            node curr = q.poll();
            ans.add(curr.data);
            if (curr.right != null) {
                q.add(curr.right);
            }
            if (curr.left != null) {
                q.add(curr.left);
            }
        }
    }

    public static void rev(node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        sol(root, ans);
        Collections.reverse(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    static int sumtree(node root) {
        if (root == null) {
            return 0;
        }
        int old = root.data;
        root.data = sumtree(root.left) + sumtree(root.right);
        return root.data + old;
    }

    static void print(node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    static node insertRec(node root, int key) {
        if (root == null) {
            root = new node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    static void in(int key) {
        insertRec(root, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        in(8);
        in(6);
        in(3);
        in(89);
        in(2);
        in(56);
        in(23);
        inorder(root);
        // sumtree(root);
        // print(root);
    }
}

class node {
    int data;
    node left;
    node right;

    public node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

class graph {
    ArrayList<Integer>[] adj;
    static int count = 0;

    public graph(int numvertices) {
        adj = new ArrayList[numvertices];
        for (int i = 1; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void connectEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void main(String[] args) {
        graph graph = new graph(4);
        graph.connectEdge(1, 0);
        graph.connectEdge(0, 2);
        graph.connectEdge(1, 3);
        graph.connectEdge(4, 3);

    }

}

class MyGraph {
    static ArrayList<Integer> adj[];

    MyGraph(int numvertices) {

        adj = new ArrayList<>();
        for (int i = 0; i < numvertices; i++) {
            adj[i] = new ArrayList<>();
        }

    }

    void addedge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void dfs() {
        boolean vis[] = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if (vis[i] == false) {

            }
        }
    }

    void dfsutil(int v, boolean vis) {

    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyGraph myGraph = new MyGraph(6);
        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            myGraph.addedge(sc.nextInt(), sc.nextInt());
        }

    }
}
