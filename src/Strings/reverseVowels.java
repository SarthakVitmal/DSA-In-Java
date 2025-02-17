package Strings;

import java.util.HashSet;

public class reverseVowels {
    public static String reverse(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('u');
        vowels.add('o');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int i = 0, j = n - 1;
        while(i < j){
            if(vowels.contains(sb.charAt(i)) && vowels.contains(sb.charAt(j))){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }else if(!vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j)))i++;
            else j--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        String ans = reverse(s);
        System.out.println(ans);
    }
}
