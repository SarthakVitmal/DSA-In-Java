package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class sortThePeople {
    public static String[] sortPeople(String[] names,int[] heights){
        String[] ans = new String[names.length];
        HashMap<String,Integer> map = new HashMap<>();
        Object[][] people = new Object[names.length][2];
        
        for (int i = 0; i < names.length; i++) {
            map.put(names[i],heights[i]);
            people[i][0] = heights[i];
            people[i][1] = names[i];
        }

        Arrays.sort(people, (a, b) -> ((Integer) b[0] - (Integer) a[0]));
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[0].length; j++) {
                ans[i] = (String) people[i][1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] height = {180,165,170};
        String[] res = sortPeople(names,height);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
