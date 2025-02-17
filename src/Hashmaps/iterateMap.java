package Hashmaps;

import java.util.HashMap;

public class iterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sarthak",1);
        map.put("Yashraj",2);
        map.put("Saket",3);
        map.put("Omkar",4);
        map.put("Raghav",5);
        map.put("Harsh",6);

        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.print(key+ " " +val);
            System.out.println();
        }
        System.out.println("-------------------");
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
