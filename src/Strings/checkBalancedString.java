package Strings;

public class checkBalancedString {
    public static void main(String[] args) {
        String s = "24123";
        boolean ans = isBalanced(s);
        System.out.println(ans);
    }

    private static boolean isBalanced(String s) {
        int evenIdx = 0; int oddIdx = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(i % 2 == 0)evenIdx += (ch[i] - '0');
            else oddIdx += (ch[i] - '0');
        }
        return evenIdx == oddIdx;
    }
}
