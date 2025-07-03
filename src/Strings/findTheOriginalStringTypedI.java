package Strings;

public class findTheOriginalStringTypedI {
    public static void main(String[] args) {
        String s = "abbcccc";
        int count = possibleStringCount(s);
        System.out.println(count);
    }

    private static int possibleStringCount(String s) {
        if(s.length() == 1)return 1;
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1))count++;
        }
        return count;
    }
}
