package Strings;

public class splitAStringInBalanced {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int ans = balancedStringSplit(s);
        System.out.println(ans);
    }

    private static int balancedStringSplit(String s) {
        int isBalanced = 0;
        int countRL = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R')countRL++;
            if(s.charAt(i) == 'L')countRL--;
            if(countRL == 0)isBalanced++;
        }
        return isBalanced;
    }
}
