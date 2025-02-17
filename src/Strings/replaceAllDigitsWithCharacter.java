package Strings;

public class replaceAllDigitsWithCharacter {
    public static String replaceDigits(String s){
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                sb.append(s.charAt(i));
            }else {
                char prevChar = s.charAt(i-1);
                int currentChar = Integer.parseInt(String.valueOf(s.charAt(i)));
                int currentAscii = Integer.parseInt(String.valueOf((int)prevChar +currentChar));
                char ch = (char)currentAscii;
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "a1b2c3d4e";
        String res = replaceDigits(s);
        System.out.println(res);
    }
}
