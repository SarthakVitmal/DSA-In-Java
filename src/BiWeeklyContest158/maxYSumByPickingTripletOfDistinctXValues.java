package BiWeeklyContest158;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class maxYSumByPickingTripletOfDistinctXValues {
    public static void main(String[] args) {
        int[] x = {1,2,1,3,2};
        int[] y = {5,3,4,6,2};
        int ans = maxSumDistinctTriplet(x,y);
        System.out.println(ans);
    }

    private static int maxSumDistinctTriplet(int[] x, int[] y) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : x)set.add(ele);
        if(set.size() <= 2)return -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            if(map.containsKey(x[i])){
                int maxValue = map.get(x[i]);
                map.put(x[i],Math.max(maxValue,y[i]));
            }else map.put(x[i],y[i]);
        }
        ArrayList<Integer> al = new ArrayList<>(map.values());
        al.sort(Collections.reverseOrder());
        return al.get(0) + al.get(1) + al.get(2);
    }
}
