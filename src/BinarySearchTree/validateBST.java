package BinarySearchTree;

public class validateBST {
    public static int max(TreeNode root){
        if(root == null)return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static int min(TreeNode root){
        if(root == null)return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static boolean isValidBST(TreeNode root){
        if(root == null)return true;
        if(root.val <= max(root.left))return false;
        if(root.val >= min(root.right))return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        TreeNode a = new TreeNode(20);
        TreeNode b = new TreeNode(70);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(30);

        root.left = a; root.right = b;
        a.left = c ; a.right = d;

        System.out.println(isValidBST(root));
    }
}
