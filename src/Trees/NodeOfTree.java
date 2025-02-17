package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class NodeOfTree {
    private static void display(Node root){
        if(root == null)return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(5);
        root.left = a;root.right = b;
        a.left = c;a.right = d;
        b.left = null;b.right = e;
        display(root);
    }
}
