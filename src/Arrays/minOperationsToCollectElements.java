package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class minOperationsToCollectElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3); al.add(1); al.add(5); al.add(4); al.add(2);
        int k = 2;
        int ops = minOperations(al,k);
        System.out.println(ops);
    }

    private static int minOperations(ArrayList<Integer> al, int k) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int count = 0;
        for (int i = 1; i <= k; i++) {
            setA.add(i);
        }
        while (setA.size() != setB.size()){
            for (int i = al.size()-1; i >= 0 && (setA.size() != setB.size()) ; i--) {
                int curr = al.get(i);
                if(setA.contains(curr)){
                    setB.add(curr);
                    count++;
                }else count++;
            }
        }
        return count;
    }
}
