package PrefixSum;

public class minStartValue {
    public static void main(String[] args) {
        int[] arr = {-3,2,-3,4,2};
        int startValue = 1; int prefixSum = 0; int minPrefixSum = 0;
        for(int num : arr){
            prefixSum += num;
            minPrefixSum = Math.min(minPrefixSum,prefixSum);
        }
        System.out.println(startValue-minPrefixSum);
    }
}
