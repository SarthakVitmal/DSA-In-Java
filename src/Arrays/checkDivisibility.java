package Arrays;

public class checkDivisibility {
    public static void main(String[] args) {
        int n = 99;
        boolean ans = checkDivisible(n);
        System.out.println(ans);
    }

    private static boolean checkDivisible(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        int sum = 0, pro = 1;
        for (int i = 0; i < sb.length(); i++) {
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += num;
            pro *= num;
        }
        return n % (sum + pro) == 0;
    }
}
