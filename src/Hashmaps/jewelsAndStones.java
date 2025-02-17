package Hashmaps;

import java.util.HashMap;

public class jewelsAndStones {
    private static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if(map.containsKey(stones.charAt(i))){
                int freq = map.get(stones.charAt(i));
                map.put(stones.charAt(i),freq+1);
            }else{
                map.put(stones.charAt(i),1);
            }
        }
        for (int i = 0; i < jewels.length(); i++) {
            if(map.containsKey(jewels.charAt(i))){
                int freq = map.get(jewels.charAt(i));
                count += freq;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        int ans = numJewelsInStones(jewels,stones);
        System.out.println(ans);
    }
}
