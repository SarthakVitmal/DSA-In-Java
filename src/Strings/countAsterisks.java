package Strings;

public class countAsterisks {
    public static void main(String[] args) {
        String s = "iamprogrammer";
        int ans = count(s);
        System.out.println(ans);
    }

    private static int count(String s) {
        int pipe = 0;
        int countAsterisk = 0;
        for (int i = 0; i < s.length(); i++) {
            if(pipe == 0 && s.charAt(i) == '|')pipe++;
            else if(pipe == 1 && s.charAt(i) == '|')pipe--;
            if(pipe == 0 && s.charAt(i) == '*')countAsterisk++;
        }
        return countAsterisk;
    }
}
