package Arrays;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class sortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(arr,0,arr.length-1);
        System.out.print("In-order Traversal of BST: ");
        inOrder(root);
    }

    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public static TreeNode sortedArrayToBST(int[] arr, int left,int right) {
        if(left > right)return null;
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrayToBST(arr,left,mid-1);
        root.right = sortedArrayToBST(arr,mid+1,right);

        return root;
    }
}
