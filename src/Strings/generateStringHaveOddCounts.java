package Strings;

/*
Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.
 */
public class generateStringHaveOddCounts {
    public static void main(String[] args) {
        int n = 5;
        String ans = generateTheString(n);
        System.out.println(ans);
    }
    public static String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n % 2 == 0){
            sb.append("a".repeat(Math.max(0, n - 1)));
            sb.append('b');
        }else {
            sb.append("a".repeat(Math.max(0, n)));
        }
        return sb.toString();
    }
}
