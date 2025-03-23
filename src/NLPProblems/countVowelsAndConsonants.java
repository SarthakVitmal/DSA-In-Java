package NLPProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class countVowelsAndConsonants {
    public static void main(String[] args) {
        String[] s = {"I love programming", "Hello World", "Java is fun", "Hackerrank"};
        ArrayList<ArrayList<Integer>> al = countVowAndConso(s);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    private static ArrayList<ArrayList<Integer>> countVowAndConso(String... s) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
        for(String str : s){
            int vowelscount = 0, consocount = 0;
            char []ch1 = str.toCharArray();
            for (int i = 0; i < ch1.length; i++) {
                if(set.contains(ch1[i]))vowelscount++;
                else if(!set.contains(ch1[i]) && !Character.isWhitespace(ch1[i]))consocount++;
            }
            ArrayList<Integer> ans = new ArrayList<>(2);
            ans.add(vowelscount);
            ans.add(consocount);
            al.add(ans);
        }
        return al;
    }
}
