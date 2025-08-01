package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minimumTimeDifference {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("23:59"); al.add("01:00"); al.add("00:00");
        int diff = findMinDiff(al);
        System.out.println(diff);
    }

    private static int findMinDiff(ArrayList<String> al) {
        ArrayList<Integer> bl = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            int mins = convertToMins(s);
            bl.add(mins);
        }
        Collections.sort(bl);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < bl.size(); i++) {
            minDiff = Math.min(minDiff,bl.get(i) - bl.get(i-1));
        }

        int firstEle = bl.get(0);
        int lastEle = bl.get(bl.size()-1);
        minDiff = Math.min(minDiff, 1440 + firstEle - lastEle);

        return minDiff;
    }

    private static int convertToMins(String s) {
        String[] str = s.split(":");
        int hrs = Integer.parseInt(str[0]) * 60;
        return hrs + Integer.parseInt(str[1]);
    }
}
