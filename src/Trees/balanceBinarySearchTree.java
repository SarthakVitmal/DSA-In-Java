package Trees;

import java.util.ArrayList;

public class balanceBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);

        root.left = null;
        root.right = b;
        b.left = null;
        b.right = c;
        c.left = null;
        c.right = d;
        ArrayList<Integer> al = new ArrayList<>();
        TreeNode ansRoot = balanceBST(root);
        print(ansRoot);
    }
    public static void print(TreeNode ansRoot){
        if(ansRoot == null)return;
        print(ansRoot.left);
        System.out.print(ansRoot.val + " ");
        print(ansRoot.right);
    }
    private static void inOrder(TreeNode ansRoot,ArrayList<Integer> al) {
        if(ansRoot == null)return;
        inOrder(ansRoot.left,al);
        al.add(ansRoot.val);
        inOrder(ansRoot.right,al);
    }

    private static TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        inOrder(root,al);
        return constructBalanced(al,0,al.size()-1);
    }

    private static TreeNode constructBalanced(ArrayList<Integer> al, int i, int j) {
        if(i > j)return null;
        int mid = (i + j) / 2;
        TreeNode node = new TreeNode(al.get(mid));
        node.left = constructBalanced(al,i,mid-1);
        node.right = constructBalanced(al,mid+1,j);
        return node;
    }
}
