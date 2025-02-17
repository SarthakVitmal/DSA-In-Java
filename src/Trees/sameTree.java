package Trees;

public class sameTree {
    private static boolean isSameTree(TreeNode p,TreeNode q){
        if(p == null && q == null)return true;
        if(p == null || q == null)return false;
        if(p.val != q.val)return false;
        if(!isSameTree(p.left,q.left))return false;
        if(!isSameTree(p.right,q.right))return false;
        return true;
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

        TreeNode root2 = new TreeNode(20);
        TreeNode b2 = new TreeNode(41);
        TreeNode c2 = new TreeNode(3);
        TreeNode d2 = new TreeNode(2);
        TreeNode e2 = new TreeNode(6);
        TreeNode f2 = new TreeNode(5);
        TreeNode g2 = new TreeNode(10);
        TreeNode h2 = new TreeNode(50);

        root2.left = b2; root2.right = c2;
        b2.left = d2;    b2.right = e2;
        c2.left = g2;    c2.right = f2;
        e2.left = null; e2.right = h2;

        boolean isSame = isSameTree(root,root2);
        System.out.println(isSame);
    }
}
