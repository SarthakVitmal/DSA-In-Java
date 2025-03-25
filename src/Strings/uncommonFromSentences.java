package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class uncommonFromSentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String []ans = uncommonFromSenten(s1,s2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }

    private static String[] uncommonFromSenten(String s1, String s2) {
        char []ch1 = s1.toCharArray();
        char []ch2 = s2.toCharArray();
        ArrayList<String> al1 = getArrayList(ch1);
        ArrayList<String> al2 = getArrayList(ch2);
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < al1.size(); i++) {
            if(map.containsKey(al1.get(i))){
                int freq = map.get(al1.get(i));
                map.put(al1.get(i),freq+1);
            }else map.put(al1.get(i),1);
        }
        for (int i = 0; i < al2.size(); i++) {
            if(map.containsKey(al2.get(i))){
                int freq = map.get(al2.get(i));
                map.put(al2.get(i),freq+1);
            }else map.put(al2.get(i),1);
        }
        ArrayList<String> al = new ArrayList<>();
        for(String ele : map.keySet()){
            int freq = map.get(ele);
            if(freq == 1)al.add(ele);
        }
        return al.toArray(new String[0]);
    }

    private static ArrayList<String> getArrayList(char[] ch1) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < ch1.length){
            while (i < ch1.length && Character.isLetterOrDigit(ch1[i])){
                sb.append(ch1[i]);
                i++;
            }
            if(!sb.isEmpty()){
                al.add(sb.toString());
                sb.setLength(0);
            }
            while (i < ch1.length && Character.isWhitespace(ch1[i]))i++;
        }
        return al;
    }
}
