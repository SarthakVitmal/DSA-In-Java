package Arrays;

public class goodPairsI {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4};
        int[] arr2 = {1,3,4};
        int k = 1;
        int ans = numberOfPairs(arr1,arr2,k);
        System.out.println(ans);
    }

    private static int numberOfPairs(int[] arr1, int[] arr2, int k){
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] % (arr2[j] * k) == 0)count++;
            }
        }
        return count;
    }
}
