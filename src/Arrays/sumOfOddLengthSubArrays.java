package Arrays;

public class sumOfOddLengthSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int ans = sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }

    private static int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if((j - i + 1) % 2 == 1){
                    int sum = 0;
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                    total += sum;
                }
            }
        }
        return total;
    }
}
