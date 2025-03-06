package Arrays;

import java.util.ArrayList;

public class selfDividingNumbers {
    public static void main(String[] args) {
        int left = 1; int right = 22;
        ArrayList<Integer> ans = selfDividingNos(left,right);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> selfDividingNos(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String s = String.valueOf(i);
            char[] ch = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                ch[j] = s.charAt(j);
            }
            boolean res = isDivisible(i,ch);
            if(res)ans.add(i);
        }
        return ans;
    }

    private static boolean isDivisible(int i, char[] ch) {
        for (int j = 0; j < ch.length; j++) {
            int digit = ch[j] - '0';
            if(digit == 0 || i % digit != 0)return false;
        }
        return true;
    }
}
