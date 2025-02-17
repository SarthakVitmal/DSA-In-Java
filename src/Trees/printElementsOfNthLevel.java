package Trees;

import java.util.Scanner;

public class printElementsOfNthLevel {
    static int n;
    public static void nThLevel(TreeNode root,int level){
        if(root == null)return;
        if(level == n){
            System.out.print(root.val + " ");
            return;
        }
        nThLevel(root.left,level+1);
        nThLevel(root.right,level+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        System.out.print("Enter n : ");
        n = sc.nextInt();
        nThLevel(root,0);

        System.out.println();

        for (int i = 0; i < 3; i++) {
            n = i;
            nThLevel(root,0);
            System.out.println();
        }
    }
}
