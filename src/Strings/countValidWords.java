package Strings;

public class countValidWords {
    public static void main(String[] args) {
        String sentence = "!";
        int ans = ValidWords(sentence);
        System.out.println(ans);
    }

    private static int ValidWords(String sentence) {
        String[] str = sentence.split(" ");
        int count = 0;
        for (String s : str) {
            if (s.matches("^[a-z]+(-[a-z]+)?[!.,]?$")) {
                count++;
            }
        }
        return count;
    }
}
