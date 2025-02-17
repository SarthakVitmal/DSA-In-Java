package Arrays;

public class maxProfit {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int maxprofit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }else{
                maxprofit = Math.max(maxprofit, arr[i] - minPrice);
            }
        }
        System.out.println(maxprofit);
    }
}
