package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class preorderTraversalIterative {
    public static ArrayList<Integer> preOrder(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null)st.push(root);
        while (!st.isEmpty()){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.right != null)st.push(top.right);
            if(top.left != null)st.push(top.left);
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(3);
        TreeNode g = new TreeNode(4);

        root.left = b; root.right = e;
        b.left = c; b.right = d;
        e.right = g; e.left = f;

        ArrayList<Integer> ans = preOrder(root);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
