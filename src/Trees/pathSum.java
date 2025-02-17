package Trees;

import java.util.ArrayList;

public class pathSum {
    public static int sumOfArrayList(ArrayList<Integer> al){
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum += al.get(i);
        }
        return sum;
    }
    public static void paths(TreeNode root, ArrayList<Integer> ans, ArrayList<ArrayList<Integer>>al, int targetSum){
        if(root == null)return;
        ans.add(root.val);
        if(root.left == null && root.right == null){
            int sum = sumOfArrayList(ans);
            if(sum == targetSum) {
                al.add(new ArrayList<>(ans));
            }
        }
        paths(root.left, new ArrayList<>(ans),al,targetSum);
        paths(root.right,new ArrayList<>(ans),al,targetSum);
        ans.remove(ans.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root,int targetSum) {
        ArrayList<ArrayList<Integer>>al = new ArrayList<>();
        paths(root,new ArrayList<>(),al,targetSum);
        return al;
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

        int targetSum = 7;
        ArrayList<ArrayList<Integer>> ans = pathSum(root,targetSum);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+ " ");
        }

    }
}
