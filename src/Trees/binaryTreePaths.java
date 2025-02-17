package Trees;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths {
    public static void paths(TreeNode root,String s,ArrayList<String> ans){
        if(root.left == null && root.right == null){
            s += root.val;
            ans.add(s);
            return;
        }
        paths(root.left,s+root.val+"->",ans);
        paths(root.right,s+root.val+"->",ans);
    }
    public static List<String> treePaths(TreeNode root){
        ArrayList<String> ans = new ArrayList<>();
        paths(root,"",ans);
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
        e.left = g; e.right = f;

        List<String> ans = treePaths(root);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + ", ");
        }
    }
}
