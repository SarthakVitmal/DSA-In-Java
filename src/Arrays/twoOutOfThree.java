package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class twoOutOfThree {
    public static void main(String[] args) {
        int[] num1 = {1,1,3,2};
        int[] num2 = {2,3};
        int[] num3 = {3};
        ArrayList<Integer> ans = twoOfThree(num1, num2, num3);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    private static ArrayList<Integer> twoOfThree(int[] num1, int[] num2, int[] num3) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(int ele : num1)set1.add(ele);
        for(int ele : num2)set2.add(ele);
        for(int ele : num3)set3.add(ele);

        HashSet<Integer> tempSet = new HashSet<>(set1);
        tempSet.retainAll(set2);
        al.addAll(tempSet);

        tempSet = new HashSet<>(set2);
        tempSet.retainAll(set3);
        al.addAll(tempSet);

        tempSet = new HashSet<>(set2);
        tempSet.retainAll(set3);
        al.addAll(tempSet);

        tempSet = new HashSet<>(set3);
        tempSet.retainAll(set1);
        al.addAll(tempSet);

        HashSet<Integer> ans = new HashSet<>(al);
        al.clear();
        al.addAll(ans);

        return al;
    }
}
