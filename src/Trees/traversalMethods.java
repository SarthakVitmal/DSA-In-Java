package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class traversalMethods {
    static ArrayList<Integer> ans;
    private static void printArrayList(ArrayList<Integer> al){
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
    }
    private static void inorder(TreeNode root){
        if(root == null)return;
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
    }
    private static void preorder(TreeNode root){
        if(root == null)return;
        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    private static void postorder(TreeNode root){
        if(root == null)return;
        postorder(root.left);
        postorder(root.right);
        ans.add(root.val);
    }

    //Breadth First Search(BFS) using Queue
    private static void levelorder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null)q.add(root);
        while (!q.isEmpty()){
            TreeNode front = q.remove();
            System.out.print(front.val + " ");
            if(front.right!=null)q.add(front.right);
            if(front.left!=null)q.add(front.left);

        }
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

        ans = new ArrayList<>();
        preorder(root);
        System.out.println("Preorder Traversal : ");
        printArrayList(ans);

        ans = new ArrayList<>();
        inorder(root);
        System.out.println("Inorder Traversal : ");
        printArrayList(ans);

        ans = new ArrayList<>();
        postorder(root);
        System.out.println("Postorder Traversal : ");
        printArrayList(ans);

        ans = new ArrayList<>();
        System.out.println("Levelorder Traversal : ");
        levelorder(root);
    }
}
