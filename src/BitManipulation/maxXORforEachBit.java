package BitManipulation;

public class maxXORforEachBit {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7};
        int maxBit = 3;
        int[] ans = getMaximumXOR(arr,maxBit);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] getMaximumXOR(int[] arr, int maxBit) {
        int[] ans = new int[arr.length];
        int i = 0;
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        while (i < arr.length){
            int max = Integer.MIN_VALUE;
            int maxK = -1;
            for (int k = 0; k < (1 << maxBit); k++) {
                int current = xor ^ k;
                if(current > max){
                    max = current;
                    maxK = k;
                }
            }
            ans[i] = maxK;
            xor ^= arr[arr.length-1-i];
            i++;
        }
        return ans;
    }
}
