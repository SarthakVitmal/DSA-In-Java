package Strings;

import java.util.ArrayList;

public class findWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        ArrayList<Integer> al = findWordsContaining(words,x);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    private static ArrayList<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) al.add(i);
        }
        return al;
    }
}
