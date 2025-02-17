package Arrays;

public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int k = 1;
        int missingCount = 0;
        int arrIdx = 0;
        int i = 1;

        while(missingCount < k){
            if(arrIdx < arr.length && i == arr[arrIdx]){
                arrIdx++;
            }else missingCount++;
            if(missingCount < k)
                i++;
        }
        System.out.println(i);
    }
}
