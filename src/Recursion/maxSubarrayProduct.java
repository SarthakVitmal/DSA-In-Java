package Recursion;

public class maxSubarrayProduct {
    public static int maxProduct(int[] arr,int i){
        if(i >= arr.length-1)return 0;
        int pro = arr[i] * arr[i+1];
        return Math.max(pro,maxProduct(arr,i+2));
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int ans = maxProduct(arr,0);
        System.out.println(ans);
    }
}
