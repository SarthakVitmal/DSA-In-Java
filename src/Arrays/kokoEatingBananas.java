package Arrays;

public class kokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int ans = minEatingSpeed(piles,h);
        System.out.println(ans);
    }

    private static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int low = 1, high = max;int i = 1;
        while (low < high){
            int hours = 0;
            int k = low + (high - low) / 2;
            System.out.println("Value of k is "+k+" in "+i+" iteration");
            for(int pile : piles){
                hours += (pile + k - 1) / k;
            }
            System.out.println("Value of hours is "+ hours +" in "+i+" iteration");
            if(hours > h){
                low = k + 1;
                System.out.println("if executed in "+i+ " iteration");
            }
            else{
                high = k;
                System.out.println("else executed in "+i+ " iteration");
            }
            i++;
            System.out.println("**************************");
        }
        return low;
    }
}
