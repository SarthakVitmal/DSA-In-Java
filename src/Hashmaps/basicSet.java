package Hashmaps;

import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert TC = O(1)
        set.add(10);
        set.add(20);
        set.add(30);

        //search - true or false TC = O(1)
        System.out.println(set.contains(60));
        System.out.println(set);

        System.out.println(set.size());
        //remove
        set.remove(10);
        System.out.println(set);

        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
