package Trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class binaryTreeZigZagLevelOrderTraversal {
    private static int level(TreeNode root){
        if(root == null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    private static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node = node;
            this.level = level;
        }
    }
    private static void BFS(TreeNode root,ArrayList<ArrayList<Integer>> ans){
        Queue<Pair> q = new LinkedList<>();
        if(root!=null)q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair front = q.remove();
            TreeNode temp = front.node;
            int lvl = front.level;

            ans.get(lvl).add(temp.val);

            if(temp.left!=null)q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null)q.add(new Pair(temp.right,lvl+1));
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(3);
        TreeNode g = new TreeNode(4);

        root.left = b; root.right = e;
        b.left = c; b.right = d;
        e.left = g; e.right = f;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int lvl = level(root);
        for (int i = 0; i < lvl; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            ans.add(arr);
        }

        BFS(root,ans);

        for (int i = 0; i < ans.size(); i++) {
            if(i%2 == 1){
                Collections.reverse(ans.get(i));
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + ",");
        }
    }
}
