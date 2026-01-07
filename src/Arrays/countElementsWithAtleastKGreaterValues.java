package Arrays;

import java.util.*;

public class countElementsWithAtleastKGreaterValues {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int k = 1;
        int ans = countElements(arr,k);
        System.out.println(ans);
    }

    private static int countElements(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                
            }
        }
        ArrayList<Integer> al = new ArrayList<>(map.keySet());
        int count = 0;
        Collections.sort(al);
        for (int i = 1; i <= al.size(); i++) {
            if(al.size() - i + 1 > k)count++;
        }
        return count;
    }
}
