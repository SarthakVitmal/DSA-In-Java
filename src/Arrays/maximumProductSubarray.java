package Arrays;

public class maximumProductSubarray {
    public static int maxProduct(int[] arr){
        int maxProduct = Integer.MIN_VALUE;
        if(arr.length == 1)return arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if(product > maxProduct)maxProduct = product;
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = {0,2};
        System.out.println(maxProduct(arr));
    }
}
