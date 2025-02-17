package Trees;

public class lowestCommonAncestors {
    public static boolean ifExist(TreeNode root,TreeNode target){
        if(root == target)return true;
        if(root == null)return false;
        return ifExist(root.left,target) || ifExist(root.right,target);
    }
    public static TreeNode lowestCommon(TreeNode root,TreeNode p,TreeNode q){
        if(p == root || q == root)return root;
        //Does 'p' lies in LST
        boolean pLiesInLST = ifExist(root.left,p);
        boolean qLiesInLST = ifExist(root.left,q);
        if(!pLiesInLST || !qLiesInLST)return root;
        if(pLiesInLST == true && qLiesInLST == true)return lowestCommon(root.left,p,q);
        if(pLiesInLST == false && qLiesInLST == false)return lowestCommon(root.right,p,q);
        else return root;
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

        TreeNode ans = lowestCommon(root,b,e);
        System.out.println(ans.val);
    }
}
