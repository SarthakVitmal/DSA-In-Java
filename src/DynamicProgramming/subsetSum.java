package DynamicProgramming;

public class subsetSum {
    public static void main(String[] args) {
        int[] arr = {0,8,5,2,4};
        int target = 15;
        boolean res = isSubsetSum(0,arr,target);
        System.out.println(res);
    }

    private static boolean isSubsetSum(int idx, int[] arr, int target) {
        if(target == 0)return true;
        if(idx == arr.length)return false;
        boolean skip = isSubsetSum(idx+1,arr,target);
        boolean take = isSubsetSum(idx + 1, arr, target - arr[idx]);
        return skip || take;
    }
}
