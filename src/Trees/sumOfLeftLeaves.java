package Trees;

public class sumOfLeftLeaves {
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

        int ans = sumOfLeft(root);
        System.out.println(ans);
    }
    static int sum = 0;

    private static int sumOfLeft(TreeNode root) {
        if(root == null)return 0;
        if(root.left != null && root.left.left == null && root.left.right == null)sum += root.left.val;
        sumOfLeft(root.left);
        sumOfLeft(root.right);
        return sum;
    }
}
