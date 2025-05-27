package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;

public class MapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sarthak",1);
        map.put("Yashraj",2);
        map.put("Saket",3);
        map.put("Deep",4);
        map.put("Raghav",5);
        map.put("Harsh",6);
        map.put("Sarthak",20);

        //Note : In a hashmap two or more keys with same value but keys are unique
        System.out.println(map.containsKey("Sarthak"));
        System.out.println(map.containsValue(20));
        System.out.println(map.size());
        System.out.println(map);

        map.remove("Raghav");
        System.out.println(map);
        System.out.println(map.get("Sarthak"));

    }
}
