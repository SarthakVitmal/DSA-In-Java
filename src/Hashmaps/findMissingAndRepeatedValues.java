package Hashmaps;

import java.util.HashMap;

public class findMissingAndRepeatedValues {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,2}};
        int[] ans = findMissingRepeated(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] findMissingRepeated(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(map.containsKey(arr[i][j]))map.put(arr[i][j],map.get(arr[i][j])+1);
                else map.put(arr[i][j],1);
            }
        }
        for (int key : map.keySet()){
            int freq = map.get(key);
            if(freq > 1){
                ans[0] = key;
                break;
            }
        }
        int n = arr[0].length;
        for (int i = 1; i <= n * n; i++) {
            if(!map.containsKey(i)){
                ans[1] = i;
                break;
            }
        }

        return ans;
    }
}
