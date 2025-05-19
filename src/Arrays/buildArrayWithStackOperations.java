package Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class buildArrayWithStackOperations {
    public static void main(String[] args) {
        int[] target = {1,2,3,5,6,8,9};
        int n = 9;
        ArrayList<String> al = buildArray(target,n);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    private static ArrayList<String> buildArray(int[] target, int n) {
        ArrayList<String> al = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int end = target[target.length-1];
        for (int i = 0; i < target.length; i++) {
            set.add(target[i]);
        }

        for (int i = 1; i <= end; i++) {
            if(set.contains(i)){
                al.add("Push");
            }else{
                al.add("Push");
                al.add("Pop");
            }
        }
        return al;
    }
}
