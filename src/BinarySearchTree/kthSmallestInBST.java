package BinarySearchTree;

import java.util.ArrayList;

public class kthSmallestInBST {
    public static void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root == null)return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        TreeNode a = new TreeNode(20);
        TreeNode b = new TreeNode(70);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(30);

        root.left = a; root.right = b;
        a.left = c ; a.right = d;
        int k=0;

        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        System.out.println(ans.get(k));

    }
}
