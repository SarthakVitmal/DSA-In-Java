package Trees;

public class sumOfDeepestNodes {
    static int sum = 0;
    public static int maxDepthOfTree(TreeNode root){
        if(root == null)return 0;
        return 1 + Math.max(maxDepthOfTree(root.left), maxDepthOfTree(root.right));
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

        int maxDepth = maxDepthOfTree(root);
        sumOfDeepest(root,1,maxDepth);
        System.out.println(sum);
    }
    private static void sumOfDeepest(TreeNode root, int curr, int maxDepth) {
        if(root == null)return;
        if(curr == maxDepth && root.left == null && root.right == null)sum += root.val;
        sumOfDeepest(root.left,curr+1,maxDepth);
        sumOfDeepest(root.right,curr+1,maxDepth);
    }
}
