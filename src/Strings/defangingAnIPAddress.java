package Strings;

public class defangingAnIPAddress {
    public static void main(String[] args) {
        String s = "255.100.50.0";
        String ans = defangIPaddr(s);
        System.out.println(ans);
    }

    private static String defangIPaddr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '.')sb.append(s.charAt(i));
            else sb.append("[.]");
        }
        return sb.toString();
    }
}
