package Strings;

public class stringHalvesAreAlike {
    public static boolean halvesAreAlike(String s){
        int n = s.length();
        String a = "";
        String b = "";
        for (int i = 0; i < n/2; i++) a += s.charAt(i);
        for (int i = n/2; i < s.length(); i++) b += s.charAt(i);

        int countFirstHalf = 0;
        int countSecondHalf = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            char ch2 = b.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')countFirstHalf++;
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' || ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U')countSecondHalf++;
        }
        if(countFirstHalf == countSecondHalf) return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "textbook";
        boolean res = halvesAreAlike(s);
        if(res) System.out.println(true);
        else System.out.println(false);
    }
}
