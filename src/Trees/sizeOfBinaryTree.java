package Trees;

public class sizeOfBinaryTree {
    private static int sizeOfTree(TreeNode root){
        if(root == null)return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);
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

        root.left = b;
        root.right = c;
        b.left = d;
        b.right = e;
        c.left = g;
        c.right = f;
        e.right = h;

        System.out.println(sizeOfTree(root));
    }
}
