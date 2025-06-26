package Heaps;

public class takeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        int[] gifts = {1,1,1,1};
        int k = 4;
        long ans = pickGifts(gifts,k);
        System.out.println(ans);
    }

    private static long pickGifts(int[] gifts, int k) {
        long sum = 0;
        while (k != 0){
            int maxGift = Integer.MIN_VALUE;
            int idx = -1;
            for (int i = 0; i < gifts.length; i++) {
                int currGift = gifts[i];
                if(currGift > maxGift){
                    maxGift = currGift;
                    idx = i;
                }
            }
            gifts[idx] = (int) Math.floor(Math.sqrt(maxGift));
            k--;
        }
        for (int gift : gifts) {
            sum += gift;
        }
        return sum;
    }
}
