package Arrays;

public class harshadNumber {
    public static void main(String[] args) {
        int x = 18;
        int ans = checkHarshadNumber(x);
        System.out.println(ans);
    }

    private static int checkHarshadNumber(int x) {
        String s = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(x % sum == 0)return sum;
        return -1;
    }
}
