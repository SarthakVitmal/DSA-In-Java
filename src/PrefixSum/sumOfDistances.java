package PrefixSum;

public class sumOfDistances {
    public static long[] distance(int[] dist){
        long[] arr = new long[dist.length];
        int n = dist.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if(i!=j && dist[i] == dist[j]){
                    sum += Math.abs(i-j);
                }
            }
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,1,2};
        long[] dist = distance(arr);
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }
}
