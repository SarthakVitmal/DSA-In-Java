package Trees;

import java.util.ArrayList;

public class sumRootToLeafNumbers {
    public static void treePaths(TreeNode root, String s, ArrayList<Integer> ans){
        if(root == null)return;
        if(root.left == null && root.right == null){
            s += root.val;
            ans.add(Integer.parseInt(s));
            return;
        }
        treePaths(root.left,s+root.val,ans);
        treePaths(root.right,s+root.val,ans);
    }
    public static int sumNumbers(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        treePaths(root,"",al);
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum;
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

        System.out.println(sumNumbers(root));
    }
}
