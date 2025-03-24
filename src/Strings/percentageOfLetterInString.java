package Strings;

public class percentageOfLetterInString {
    public static void main(String[] args) {
        String s = "foobar";
        char ch = 'o';
        int ans = percentageLetter(s,ch);
        System.out.println(ans);
    }

    private static int percentageLetter(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ch)count++;
        }
        double res = (double)count/s.length();
        res = res * 100;
        return (int)res;
    }
}
