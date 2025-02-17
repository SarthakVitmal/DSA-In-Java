package Strings;
import java.util.*;
public class anagram {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "kagaram";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int flag = 0;

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean areAnagrams = Arrays.equals(ch1, ch2);

        if (areAnagrams) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
