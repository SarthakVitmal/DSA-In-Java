package BinarySearchTree;

public class searchInBST {
    public static boolean search(TreeNode root,int val){
        if(root == null)return false;
        if(root.val > val)return search(root.left,val);
        if(root.val < val)return search(root.right,val);
        else return true;
    }
    public static void inOrder(TreeNode root){
        if(root == null)return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(7);
        TreeNode c = new TreeNode(1);
        TreeNode d = new TreeNode(3);

        root.left = a; root.right = b;
        a.left = c ; a.right = d;

        boolean res = search(root,7);
        System.out.println(res);

        inOrder(root);
    }
}
