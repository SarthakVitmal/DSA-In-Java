package Arrays;

public class countSubarraysWthMajorityElement {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        int target = 1;
        int ans = countMajoritySubarrays(arr,target);
        System.out.println(ans);
    }

    private static int countMajoritySubarrays(int[] arr, int target) {
        int countSubarrays = 0;
        int i = 0, j = 0;
        while (i < arr.length){
            j = i;
            while (j < arr.length){
                int countTarget = 0;
                for (int k = i; k <= j; k++) {
                    if(arr[k] == target)countTarget++;
                }
                if(2 * countTarget > j - i + 1)countSubarrays++;
                j++;
            }
            i++;
        }
        return countSubarrays;
    }
}
