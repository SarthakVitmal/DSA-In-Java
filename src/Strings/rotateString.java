package Strings;

public class rotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean ans = rotateStr(s,goal);
        System.out.println(ans);
    }

    private static boolean rotateStr(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            if(sb.toString().equals(goal))return true;
        }
        return false;
    }
}
