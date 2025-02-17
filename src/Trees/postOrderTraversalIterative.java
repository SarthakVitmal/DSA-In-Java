package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class postOrderTraversalIterative {
    private static ArrayList<Integer> postOrder(TreeNode root){
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root!=null)st.push(root);
        while (!st.isEmpty()){
            TreeNode temp = st.pop();
            ans.add(temp.val);
            if(temp.left!=null)st.push(temp.left);
            if(temp.right!=null)st.push(temp.right);
        }
        Collections.reverse(ans);
        return ans;
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

        ArrayList<Integer> ans = postOrder(root);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
