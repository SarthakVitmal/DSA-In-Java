package Hashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class findPlayersWithZeroOrOneLoss {
    public static void main(String[] args) {
        int[][] matches = {{1,2},{2,3},{4,2},{1,3}};
        ArrayList<ArrayList<Integer>> result = findWinners(matches);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    private static ArrayList<ArrayList<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int[] match : matches){
            int winner = match[0];
            int loser = match[1];

            set.add(winner);
            set.add(loser);

            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }

        ArrayList<Integer> zeroLoss = new ArrayList<>();
        ArrayList<Integer> oneLoss = new ArrayList<>();

        for (int ele : set) {
            int count = map.getOrDefault(ele, 0);
            if(count == 0)zeroLoss.add(ele);
            if(count == 1)oneLoss.add(ele);
        }
        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(zeroLoss);
        ans.add(oneLoss);
        return ans;
    }
}
