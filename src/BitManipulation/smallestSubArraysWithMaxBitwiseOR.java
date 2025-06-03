package BitManipulation;

public class smallestSubArraysWithMaxBitwiseOR {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int[] ans = smallestSubarrays(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] smallestSubarrays(int[] arr) {
        int maxOr = 0;
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            maxOr |= arr[i];
        }

        for (int i = 0; i < n; i++) {
            int currOr = 0;
            for (int j = i; j < n; j++) {
                currOr |= arr[j];
                if(currOr == maxOr){
                    ans[i] = j - i + 1;
                    break;
                }
            }
        }

        System.out.println(maxOr);
        return ans;
    }
}
