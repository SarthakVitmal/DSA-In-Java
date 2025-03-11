package Arrays;

/*
Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.

After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
 */
public class sumOfDigitsinBaseK {
    public static void main(String[] args) {
        int n = 34;
        int k = 6;
        int ans = sumBase(n,k);
        System.out.println(ans);
    }

    private static int sumBase(int n, int k) {
        if(k == 10){
            int sum = 0;
            String s = String.valueOf(n);
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i) - '0';
                sum += ch;
            }
            return sum;
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while(n!=0){
            sb.append(n % k);
            n = n / k;
        }
        if(sb.length() == 1){
            String s = sb.toString();
            return Integer.parseInt(s);
        }else{
            for (int i = 0; i < sb.length(); i++) {
                int ch = sb.charAt(i) - '0';
                sum += ch;
            }
        }
        return sum;
    }
}
