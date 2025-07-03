package Strings;

public class findTheKthCharacterInStringGameI {
    public static void main(String[] args) {
        int k = 5;
        char ch = kthCharacter(k);
        System.out.println(ch);
    }

    private static char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (k > sb.length()){
            int len = sb.length();
            for (int i = 0; i < len; i++) {
                char next = sb.charAt(i) == 'z' ? 'a' : (char)(sb.charAt(i)+1);
                sb.append(next);
            }
        }
        System.out.println(sb);
        return sb.charAt(k-1);
    }
}
