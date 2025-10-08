package Arrays;

import java.util.ArrayList;

public class successfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        int success = 7;

        int[] ans = successfulPairs(spells,potions,success);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] successfulPairs(int[] spells, int[] potions, int success) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < spells.length; i++) {
            int count = 0;
            for (int j = 0; j < potions.length; j++) {
                if(spells[i] * potions[j] >= success)count++;
            }
            al.add(count);
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
