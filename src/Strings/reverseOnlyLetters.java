package Strings;

public class reverseOnlyLetters {
    public static String reverseLetters(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length()-1;

        while(i<j){
            int asciiI = sb.charAt(i);
            int asciiJ = sb.charAt(j);
            if(((asciiI >= 65 && asciiI <= 90) || (asciiI >= 97 && asciiI <= 122)) && ((asciiJ >= 65 && asciiJ <= 90) || (asciiJ >= 97 && asciiJ <= 122))){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++; j--;
            }else if(((asciiI < 65 || asciiI > 90) && (asciiI < 97 || asciiI > 122)) && ((asciiJ >= 65 && asciiJ <= 90) || (asciiJ >= 97 && asciiJ <= 122)))i++;
            else j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "F`abk";
        String ans = reverseLetters(s);
        System.out.println(ans);
    }
}
