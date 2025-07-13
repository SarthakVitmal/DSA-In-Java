package Strings;

public class processStringWithSpecialOperationII {
    public static void main(String[] args) {
        String s = "fwp*m*#a%%";
        long k = 5;
        char ans = processStr(s,k);
        System.out.println(ans);
    }

    private static char processStr(String s, long k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) sb.append(s.charAt(i));
            else if (s.charAt(i) == '*') {
                if (!sb.isEmpty()) sb.deleteCharAt(sb.length() - 1);
            }else if(s.charAt(i) == '#')sb.append(sb);
            else if (s.charAt(i) == '%') sb.reverse();
            System.out.println(i);
            System.out.println(sb);
        }
        if(k+1 > sb.length() || sb.isEmpty())return '.';
        return sb.charAt((int)k);
    }
}