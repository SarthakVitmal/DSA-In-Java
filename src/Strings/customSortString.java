package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class customSortString {
    public static void print(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        String ans = customSort(order,s);
        System.out.println(ans);
    }

    private static String customSort(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch))map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                for (int j = 0; j < freq; j++) {
                    sb.append(ch);
                }
            }
        }
        for(char ch : map.keySet()){
            if(order.indexOf(ch) == -1){
                int freq = map.get(ch);
                for (int i = 0; i < freq; i++) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
