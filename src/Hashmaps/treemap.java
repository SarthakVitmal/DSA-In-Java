package Hashmaps;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        /*
        Treemap are used to sort in ascending order on the basic of key
        Ordered Map
         */
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Sarthak",1);
        map.put("Ayushi",2);
        map.put("raghav",3);

        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
