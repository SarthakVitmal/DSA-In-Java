package Trees;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class inOrderTraversal {
    private static void inOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while(true){
            if(temp != null){
                st.push(temp);
                temp = temp.left;
            }else{
                if(st.isEmpty())break;
                TreeNode top = st.pop();
                System.out.print(top.val + " ");
                temp = top.right;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        root.left = b; root.right = e;
        b.left = c; b.right = d;
        e.right = g; e.left = f;

        inOrder(root);
    }
}
