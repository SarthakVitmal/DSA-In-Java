package Hashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class minimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        String[] ans = findRestuarant(list1,list2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static String[] findRestuarant(String[] list1, String[] list2) {
        HashMap<String,Integer> list1Map = new HashMap<>();
        HashMap<String,Integer> list2Map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            list1Map.put(list1[i],i);
        }
        for (int i = 0; i < list2.length; i++) {
            list2Map.put(list2[i],i);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(String key : list1Map.keySet()){
            if(list2Map.containsKey(key)){
                map.put(key,list1Map.get(key)+list2Map.get(key));
            }
        }
        ArrayList<String> al = new ArrayList<>();
        //Removing the max value
            int minSum = Integer.MAX_VALUE;
            for(int values : map.values()){
                minSum = Math.min(minSum, values);
            }
            for(String key : map.keySet()){
                if(map.get(key) == minSum){
                    al.add(key);
                }
            }
        String[] arr = new String[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }
}
