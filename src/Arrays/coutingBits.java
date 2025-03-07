package Arrays;

/*
Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is
the number of 1's in the binary representation of i.
 */
public class coutingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] ans = countingBit(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] countingBit(int n) {
        int[] ans = new int[n+1];
        for(int i = 0; i<=n; i++){
            int j = i, cnt = 0;
            while(j != 0){
                if(j % 2 == 1) cnt++;
                j /= 2;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}
