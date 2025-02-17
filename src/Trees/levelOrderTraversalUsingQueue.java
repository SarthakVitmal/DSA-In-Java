package Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversalUsingQueue {
    static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node = node;
            this.level = level;
        }
    }
    public static void BFS(TreeNode root){
        int prelevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root!=null)q.add(new Pair(root,0));
        while (!q.isEmpty()) {
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;
            if (prelevel != lvl) {
                System.out.println();
                prelevel++;
            }
            System.out.print(temp.val + " ");
            if (temp.left != null) q.add(new Pair(temp.left, lvl + 1));
            if (temp.right != null) q.add(new Pair(temp.right, lvl + 1));
        }
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

        BFS(root);
    }
}
