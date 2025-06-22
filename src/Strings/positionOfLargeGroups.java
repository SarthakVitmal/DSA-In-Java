package Strings;

import java.util.ArrayList;

public class positionOfLargeGroups {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        ArrayList<ArrayList<Integer>> ans = largeGroupPositions(s);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> largeGroupPositions(String s) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        int i = 0, j = 0;
        int count = 0;
        ArrayList<Integer> subAl = new ArrayList<>();
        while (j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                count++;
                j++;
            }
            else{
                if(count >= 3){
                    subAl.add(i);
                    subAl.add(j-1);
                    al.add(subAl);
                    subAl = new ArrayList<>();
                }
                count = 0;
                i = j;
            }
        }
        if(count >= 3){
            subAl.add(i);
            subAl.add(j-1);
            al.add(subAl);
        }
        return al;
    }
}
