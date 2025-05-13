package Strings;

public class sortTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }

    private static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for(String word : words){
            int len = word.length();
            int pos = Character.getNumericValue(word.charAt(len-1));
            result[pos - 1] = word.substring(0,len-1);
        }
        return String.join(" ",result);
    }
}
