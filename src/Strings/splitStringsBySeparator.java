package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class splitStringsBySeparator {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("one.two.three");
        words.add("four.five");
        words.add("six");
        char separator = '.';
        ArrayList<String> ans = splitWordsBySeparator(words,separator);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<String> splitWordsBySeparator(ArrayList<String> words, char separator) {
        ArrayList<String> al = new ArrayList<>();
        String separatorRegex = (separator == '.' || separator == '|' || separator == '*' ||
                separator == '+' || separator == '?' || separator == '\\' ||
                separator == '^' || separator == '$' || separator == '[' ||
                separator == ']' || separator == '(' || separator == ')')
                ? "\\" + separator : String.valueOf(separator);

        for (String s : words) {
            String[] part = s.split(separatorRegex);
            for(String p : part){
                if(!p.isEmpty())al.add(p);
            }
        }
        return al;
    }
}
