package Arrays;

public class minimumDistance {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,1,2};
        int ans = minDist(arr);
        System.out.println(ans);
    }

    private static int minDist(int[] arr) {
        if(arr.length < 3)return -1;
        if(arr.length == 3 && (arr[0] != arr[1] || arr[1] != arr[2]));
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-2; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] == arr[j] && arr[j] == arr[k] && arr[i] == arr[k]){
                        min = Math.abs(i-j) + Math.abs(j-k) + Math.abs(i-k);
                    }
                    minDiff = Math.min(min,minDiff);
                }
            }
        }
        if(minDiff == Integer.MAX_VALUE)return -1;
        return minDiff;
    }
}
