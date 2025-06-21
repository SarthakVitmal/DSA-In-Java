package Strings;

import java.util.ArrayList;
import java.util.Objects;

public class occurrencesAfterBigram {
    public static void main(String[] args) {
        String text = "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa";
        String first = "kcyxdfnoa";
        String second = "jkypmsxd";
        String[] ans = findOcurrences(text,first,second);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> al = new ArrayList<>();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(i < words.length-2 && Objects.equals(words[i], first) && Objects.equals(words[i + 1], second)){
                al.add(words[i+2]);
            }
        }
        String[] ans = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
