package BitManipulation;

public class findTheOriginalArrayOfPrefixXOR {
    public static void main(String[] args) {
        int[] pre = {5,2,0,3,1};
        int[] ans = findArray(pre);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] findArray(int[] pre) {
        if(pre.length <= 1)return pre;
        int[] ans = new int[pre.length];
        ans[0] = pre[0];
        for (int i = 1; i < pre.length; i++) {
            ans[i] = pre[i] ^ pre[i-1];
        }
        return ans;
    }
}
