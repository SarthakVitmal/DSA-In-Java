package Strings;

public class reverseWordsInStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    private static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            sb.append(new StringBuilder(words[i]).reverse());

            if(i < words.length-1)sb.append(" ");
        }
        return sb.toString();
    }
}
