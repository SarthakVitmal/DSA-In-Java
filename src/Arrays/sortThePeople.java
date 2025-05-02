package Arrays;

import java.util.HashMap;

public class sortThePeople {
    public static String[] sortPeople(String[] names,int[] heights){
        String[] ans = new String[names.length];
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(names[i],heights[i]);
        }

        System.out.println(map);
        return ans;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] height = {180,165,170};
        String[] res = sortPeople(names,height);
    }
}
