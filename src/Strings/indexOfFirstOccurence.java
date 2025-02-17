package Strings;

public class indexOfFirstOccurence {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leet";

        int i = haystack.indexOf(needle);

        if(i!=-1) System.out.println(i);
        else System.out.println(-1);
    }
}
