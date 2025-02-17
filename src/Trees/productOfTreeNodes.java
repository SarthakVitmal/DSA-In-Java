package Trees;

public class productOfTreeNodes {
    private static int productOfNodes(TreeNode root){
        if(root == null)return 1;
        return root.val * productOfNodes(root.left) * productOfNodes(root.right);
    }
    private static int productOfNonZeroNodes(TreeNode root){
        if(root == null)return 1;
        if(root.val != 0) return root.val * productOfNonZeroNodes(root.left) * productOfNonZeroNodes(root.right);
        return productOfNonZeroNodes(root.left) * productOfNonZeroNodes(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode b = new TreeNode(41);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(10);
        TreeNode h = new TreeNode(0);

        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = g; c.right = f;
        e.right = h;

        System.out.println(productOfNodes(root));
        System.out.println(productOfNonZeroNodes(root));
    }
}
