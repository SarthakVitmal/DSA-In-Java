package Strings;

import java.util.ArrayList;

public class checkIfNumbersAreInAscending {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        boolean ans = areNumbersAscending(s);
        System.out.println(ans);
    }

    private static boolean areNumbersAscending(String s) {
        ArrayList<Integer> al = new ArrayList<>();
        String[] ans = s.split(" ");
        for (int i = 0; i < ans.length; i++) {
            String word = ans[i];
            if (word.matches("\\d+")) {
                al.add(Integer.parseInt(word));
            }
        }
        for (int i = 0; i < al.size()-1; i++) {
            if(al.get(i) > al.get(i+1))return false;
        }
        return true;
    }
}
