package SlidingWindow;

public class averageGreaterOrEqualToThreshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold){
        int n = arr.length;
        int count = 0;
        int sum = 0;
        int i=0; int j=k-1;
        for (int a = 0; a <= j; a++) {
            sum += arr[a];
        }
        if(sum / k >= threshold)count++;
        i++; j++;
        while (j<n){
            sum = sum - arr[i-1] + arr[j];
            if(sum / k >= threshold)count++;
            i++; j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        int count = numOfSubarrays(arr,k,threshold);
        System.out.println(count);
    }
}
