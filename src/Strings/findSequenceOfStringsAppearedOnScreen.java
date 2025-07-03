package Strings;

import java.util.ArrayList;

public class findSequenceOfStringsAppearedOnScreen {
    public static void main(String[] args) {
        String target = "abc";
        ArrayList<String> ans = stringSequence(target);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<String> stringSequence(String target) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            sb.append('a');
            al.add(sb.toString());

            while (sb.charAt(sb.length()-1) != target.charAt(i)){
                char lastChar = sb.charAt(sb.length()-1);
                char nextChar = (lastChar == 'z') ? 'a' : (char)(lastChar + 1);
                sb.setCharAt(i,nextChar);
                al.add(sb.toString());
            }
        }
        return al;
    }
}
