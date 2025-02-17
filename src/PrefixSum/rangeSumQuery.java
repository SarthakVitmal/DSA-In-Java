package PrefixSum;

public class rangeSumQuery {
    public static int sumRange(int[] arr,int left,int right){
        if(left == 0)return arr[right];
        return arr[right] - arr[left-1];
    }
    public static int[] prefixSum(int[] arr){
        if(arr.length == 1)return arr;
        for (int i = 1; i < arr.length; i++)arr[i] = arr[i] + arr[i-1];
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,8,2,4,3,2};
        int[] res = prefixSum(arr);
        int rangeSum = sumRange(res,0,5);
        System.out.println(rangeSum);
    }
}
