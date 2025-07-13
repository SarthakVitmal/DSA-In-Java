package Strings;

public class processStringWithSpecialOperation {
    public static void main(String[] args) {
        String s = "z*#";
        String ans = processStr(s);
        System.out.println(ans);
    }

    private static String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))sb.append(s.charAt(i));
            else if(s.charAt(i) == '*'){
                if(!sb.isEmpty())sb.deleteCharAt(sb.length()-1);
            }else if(s.charAt(i) == '#')sb.append(sb.toString(), 0, sb.length());
            else if(s.charAt(i) == '%') sb.reverse();
            System.out.println(i);
            System.out.println(sb);
        }
        return sb.toString();
    }
}
