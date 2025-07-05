package Strings;

import java.util.ArrayList;

public class minOperationsToMoveAllBallsToEachBox {
    public static void main(String[] args) {
        String boxes = "001011";
        int[] ans = minOperations(boxes);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] minOperations(String boxes) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < boxes.length(); i++) {
            int sum = 0;
            for (int j = 0; j < boxes.length(); j++) {
                if(boxes.charAt(j) == '1'){
                    sum += Math.abs(j-i);
                }
            }
            al.add(sum);
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
