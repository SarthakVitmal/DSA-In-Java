package Strings;

public class toLowerCase {
    public static void main(String[] args) {
        String s = "HELLO";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            ch[i] = (char) (ch[i] + ('a' - 'A'));
        }
        String res = "";
        for (int i = 0; i < ch.length; i++) {
            res += ch[i];
        }
        System.out.println(res);
    }
}
