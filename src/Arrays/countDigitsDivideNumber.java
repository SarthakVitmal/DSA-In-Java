package Arrays;

public class countDigitsDivideNumber {
    public static void main(String[] args) {
        int n = 121;
        int ans = countDigits(n);
        System.out.println(ans);
    }

    private static int countDigits(int n) {
        int count = 0;
        String s = String.valueOf(n);
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (int i = 0; i < ch.length; i++) {
            int digit = ch[i] - '0';
            if(n % digit == 0)count++;
        }
        return count;
    }
}
