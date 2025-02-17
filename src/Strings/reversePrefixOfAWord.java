package Strings;

public class reversePrefixOfAWord {
    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        String ans = reversePrefix(word,ch);
        System.out.println(ans);
    }

    private static String reversePrefix(String word, char ch) {
        boolean firstOcc = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if(!firstOcc && word.charAt(i) == ch){
                sb.append(word.charAt(i));
                sb.reverse();
                firstOcc = true;
            }else sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
