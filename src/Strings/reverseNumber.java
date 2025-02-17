package Strings;

public class reverseNumber {
    public static int reverse(int n){
        int temp = n;
            StringBuilder res = new StringBuilder();
            if (n < 0) temp = -1 * n;
            String s = Integer.toString(temp);
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != 0) res.append(s.charAt(i));
            }
            int ans = Integer.parseInt(res.toString());
            if (n < 0) {
                ans = -1 * ans;
            }
            return ans;
    }
    public static void main(String[] args) {
        int n = -430;
        int res = reverse(n);
        System.out.println(res);
    }
}
