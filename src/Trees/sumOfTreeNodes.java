package Trees;
import Trees.TreeNode;
public class sumOfTreeNodes {
    private static int sumOfNodes(TreeNode root){
        if(root == null)return 0;
        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(41);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(5);
        TreeNode g = new TreeNode(10);
        TreeNode h = new TreeNode(20);

        root.left = b; root.right = c;
        b.left = d; b.right = e;
        c.left = g; c.right = f;
        e.right = h;

        System.out.println(sumOfNodes(root));
    }
}
