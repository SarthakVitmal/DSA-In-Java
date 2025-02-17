package Arrays;

public class removeOneElementToMakeArrayStrictlyIncreasing {
    public static boolean canBeIncreasing(int[] arr){
        int count = 0;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                count++;
                if (count > 1) return false;
                if (i > 1 && i < arr.length - 1 && arr[i] <= arr[i - 2] && arr[i + 1] <= arr[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2};
        boolean res = canBeIncreasing(arr);
        if(res) System.out.println(true);
        else System.out.println(false);
    }
}
