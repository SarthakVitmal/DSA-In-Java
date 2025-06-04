package Trees;

import java.util.Stack;

class Node99{
    int val;
    Node99 left;
    Node99 right;
    Node99(Integer val){
        this.val = val;
    }
}
public class constructBSTFromPreorderTraversal {
    private static void printInorder(Node99 root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        Node99 ans = bstFromPreorder(preorder);
        printInorder(ans);
    }

    private static Node99 bstFromPreorder(int[] preorder) {
        Stack<Node99> st = new Stack<>();
        Node99 root = new Node99(preorder[0]);
        st.push(root);
        for (int i = 1; i < preorder.length; i++) {
            Node99 node = new Node99(preorder[i]);
            if (preorder[i] < st.peek().val) {
                st.peek().left = node;
            } else {
                Node99 parent = null;
                while (!st.isEmpty() && st.peek().val < preorder[i]) {
                    parent = st.pop();
                }
                parent.right = node;
            }
            st.push(node);
        }
        return root;
    }
}
