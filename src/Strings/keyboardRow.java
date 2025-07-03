package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class keyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] ans = findWords(words);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static String[] findWords(String[] words) {
        ArrayList<String> al = new ArrayList<>();
        HashSet<Character> row1 = new HashSet<>(Arrays.asList(
                'q','w','e','r','t','y','u','i','o','p'));

        HashSet<Character> row2 = new HashSet<>(Arrays.asList(
                'a','s','d','f','g','h','j','k','l'));

        HashSet<Character> row3 = new HashSet<>(Arrays.asList(
                'z','x','c','v','b','n','m'));

        for (String word : words) {
            char[] arr = word.toCharArray();
            char firstLetter = Character.toLowerCase(word.charAt(0));
            HashSet<Character> targetRow;
            if(row1.contains(firstLetter))targetRow = row1;
            else if(row2.contains(firstLetter))targetRow = row2;
            else targetRow = row3;
            boolean isValid = true;
            for (char c : arr) {
                if(!targetRow.contains(Character.toLowerCase(c))){
                    isValid = false;
                    break;
                }
            }
            if (isValid)al.add(word);
        }
        String[] ans = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
