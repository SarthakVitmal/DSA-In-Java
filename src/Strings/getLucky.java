package Strings;

public class getLucky {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        int ans = getLuckyNumber(s,k);
        System.out.println(ans);
    }

    private static int getLuckyNumber(String s, int k) {
        int count = 1; StringBuilder sum = null;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) - 'a' + 1);
            sum.append(s.charAt(i) - 'a' + 1);
        }
        System.out.println(sum);
        return 0;
    }
}
