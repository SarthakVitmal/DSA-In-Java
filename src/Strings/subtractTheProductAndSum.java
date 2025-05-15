package Strings;

public class subtractTheProductAndSum {
    public static void main(String[] args) {
        int n = 234;
        int ans = subtractProductAndSum(n);
        System.out.println(ans);
    }

    private static int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int pro = 1; int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = Integer.parseInt(String.valueOf(s.charAt(i)));
            pro *= curr;
            sum += curr;
        }
        return pro - sum;
    }
}
