package Trees;

public class invertBinaryTree {
    private static void preorder(TreeNode root){
        if(root == null)return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void invert(TreeNode root){
        if(root == null)return;
        if(root.left == null && root.right == null)return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
    private static TreeNode invertTree(TreeNode root){
        invert(root);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        TreeNode b = new TreeNode(41);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(10);
        TreeNode h = new TreeNode(50);

        root.left = b; root.right = c;
        b.left = d;    b.right = e;
        c.left = g;    c.right = f;
        e.left = null; e.right = h;

        System.out.println("Before Inverting : ");
        preorder(root);
        System.out.println();
        invertTree(root);
        System.out.println("After Inverting : ");
        preorder(root);
    }
}
