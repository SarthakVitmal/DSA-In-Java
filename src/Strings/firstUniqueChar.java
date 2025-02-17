package Strings;

public class firstUniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char[] ch = s.toCharArray();
        int nonRepeatIdx = -1;
        int i = 0;

        while (i < ch.length - 1) {
            int j = i + 1;
            if (ch[i] == ch[j]) {
                i++;
            } else {
                nonRepeatIdx = i;
                break;
            }
        }

        System.out.println(nonRepeatIdx);
    }
}
