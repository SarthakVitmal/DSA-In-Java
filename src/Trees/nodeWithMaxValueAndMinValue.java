package Trees;

public class nodeWithMaxValueAndMinValue {
    private static int maxValue(TreeNode root){
        if(root == null)return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    }
    private static int minValue(TreeNode root){
        if(root == null)return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(minValue(root.left),minValue(root.right)));
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
        b.left = d; b.right = e;
        c.left = g; c.right = f;
        e.right = h;

        System.out.println(maxValue(root));
        System.out.println(minValue(root));
    }
}
