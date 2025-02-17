package Trees;

public class symmetricTree {
    public static boolean isSame(TreeNode p,TreeNode q){
        if(p == null && q == null)return true;
        if(p == null || q == null)return false;
        if(p.val == q.val)return true;
        if(!isSame(p.left,q.right))return false;
        if(!isSame(p.right,q.left))return false;
        return true;
    }
    public static boolean isSymmetric(TreeNode root){
        if(root == null)return true;
        return isSame(root.left,root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(2);
        TreeNode f = new TreeNode(3);
        TreeNode g = new TreeNode(4);

        root.left = b; root.right = e;
        b.left = c; b.right = d;
        e.left = g; e.right = f;

        System.out.println(isSymmetric(root));

    }
}
