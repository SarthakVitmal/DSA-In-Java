package Trees;

public class minDepth {
    public static int minimumDepthOfTree(TreeNode root){
        if(root == null)return 0;
        if(root.right == null) return 1 + minimumDepthOfTree(root.left);
        if(root.left == null)return  1 + minimumDepthOfTree(root.right);
        return 1 + Math.min(minimumDepthOfTree(root.left),minimumDepthOfTree(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);

        root.left = b;
        root.right = c;
        c.left = d;
        c.right = e;

        int depth = minimumDepthOfTree(root);
        System.out.println(depth);
    }
}
