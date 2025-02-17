package Arrays;

public class multiplyingFoundValuesByTwo {
    public static boolean isContains(int []arr,int original){
        for(int num : arr){
            if(num == original)return true;
        }
        return false;
    }
    public static int findFinalValue(int[] arr,int original){
        while (isContains(arr,original)){
            original = original * 2;
        }
        return original;
    }
    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        int res = findFinalValue(nums,original);
        System.out.println(res);
    }
}
