import javafx.scene.transform.Rotate;

public class singlelinkedlistToBst {
    // static node head;
    // class node {
    // int data;
    // int next;

    // node(int data) {
    // data = data;
    // next = null;
    // }
    // }

    class bst {
        int data;
        bst left;
        bst right;

        bst(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // void add(int data) {
    // node newnode = new node(data);
    // if (head == null) {
    // newnode = head;
    // } else {
    // node curr = head;
    // while (curr.next!= null) {
    // curr = curr.next;
    // }
    // curr = newnode;

    // }

    // }

    // void print() {
    // node curr = head;
    // while (curr != null) {
    // System.out.print(curr.data + " ");
    // }

    // }

    public static void main(String[] args) {
        singlelinkedlistToBst b = new singlelinkedlistToBst();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        bst head = null;
        bst root = b.balance(n, arr, head);
        b.Preorder(root);
    }

    bst balance(int n, int arr[], bst root) {
        if (n <= 0) {
            return null;
        }

        int l = 1;
        int r = n;
        if (l <= r) {
            int mid = l - (r + l) / 2;
            bst left = balance(mid, arr, root);
            root = new bst(arr[n - 1]);
            root.left = left;
            root.right = balance(mid + 1, arr, root);
        }
        return root;
    }

    void Preorder(bst root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        Preorder(root.left);
        Preorder(root.right);
    }
}
