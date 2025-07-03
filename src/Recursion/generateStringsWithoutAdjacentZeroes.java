package Recursion;

import java.util.ArrayList;

public class generateStringsWithoutAdjacentZeroes {
    public static void main(String[] args) {
        int x = 3;
        ArrayList<String> ans = validStrings(x);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<String> validStrings(int x) {
        ArrayList<String> al = new ArrayList<>();
        generateStrings(x, al,"",'-');
        return al;
    }

    private static void generateStrings(int x, ArrayList<String> al, String curr, char prev) {
        if(curr.length() == x){
            al.add(curr);
            return;
        }
        generateStrings(x, al,curr + '1', '1');
        if(prev !='0')generateStrings(x,al,curr+'0','0');
    }
}
