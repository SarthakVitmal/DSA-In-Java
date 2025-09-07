package Arrays;

import java.util.ArrayList;

public class findNIntegersSumUptoZero {
    public static void main(String[] args) {
        int n = 4;
        int[] ans = sumZero(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] sumZero(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            al.add(i);
            al.add(i * -1);
        }
        if(n % 2 == 1)al.add(0);
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
