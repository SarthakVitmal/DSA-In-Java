package Strings;

public class longestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    private static String longestPalindrome(String s) {
        String maxLen = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i,j+1);
                if(isPalindrome(sub) && sub.length() > maxLen.length()){
                    maxLen = sub;
                }
            }
        }
        return maxLen;
    }
}
