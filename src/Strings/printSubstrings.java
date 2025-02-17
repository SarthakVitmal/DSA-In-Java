package Strings;

public class printSubstrings {
    public static void main(String[] args) {
        String str = "abcde";

        System.out.println("Substrings : ");
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                System.out.print(str.substring(i,j) + " ");
            }
            System.out.println();
        }
    }
}
