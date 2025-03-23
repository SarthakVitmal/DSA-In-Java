package NLPProblems;

import java.util.ArrayList;

public class tokenization {
    public static void main(String[] args) {
        String s = "I love programming!";
        ArrayList<String> ans = applyTokenization(s);
        for (String word : ans) {
            System.out.println(word);
        }
        System.out.println("[\"" + String.join("\", \"", ans) + "\"]");
    }

    private static ArrayList<String> applyTokenization(String s) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        int i=0;

        while(i < ch.length) {
            while (i < ch.length && Character.isLetterOrDigit(ch[i])) {
                sb.append(ch[i]);
                i++;
            }

            if (!sb.isEmpty()) {
                al.add(sb.toString());
                sb.setLength(0);
            }

            while (i < ch.length && !Character.isSpaceChar(ch[i]) && !Character.isLetterOrDigit(ch[i])){
                al.add(String.valueOf(ch[i]));
                i++;
            }

            while (i < ch.length && Character.isSpaceChar(ch[i]))i++;
        }
        return al;
    }
}
