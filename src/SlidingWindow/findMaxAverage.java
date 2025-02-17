package SlidingWindow;

public class findMaxAverage {
    public static double findMaxAvg(int[] arr,int k){
        int n = arr.length;
        int i = 0; int j = k-1;
        double sum = 0; double avg = 0; double maxAvg = 0;
        for (int a = i; a <= j; a++) {
            sum += arr[a];
        }
        avg = sum / k;
        maxAvg = avg;
        if(n == k)return maxAvg;
        i++; j++;
        while (j<n){
            sum = sum - arr[i-1] + arr[j];
            avg = sum / k;
            maxAvg = Math.max(avg,maxAvg);
            i++;j++;
        }
        return maxAvg;
    }
    public static void main(String[] args) {
        int[] arr = {9,7,3,5,6,2,0,8,1,9};
        int k = 6;
        double ans = findMaxAvg(arr,k);
        System.out.println(ans);
    }
}
