package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeRightSideView {
    static int n = 2;
    public static void nThLevel(TreeNode root,int level){
        if(root == null)return;
        if(level > n){
            System.out.print(root.val + " ");
            return;
        }
        nThLevel(root.left,level+1);
        nThLevel(root.right,level+1);
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

        nThLevel(root,0);
    }
}
