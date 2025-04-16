package Arrays;

//leetcode - 2078. Two Furthest Houses With Different Colors
public class twoFarthestHouseDist {
    public static void main(String[] args) {
        int[] arr = {1,8,3,8,3};
        int dist = maxDistance(arr);
        System.out.println(dist);
    }

    private static int maxDistance(int[] arr) {
        int maxDist = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] != arr[j]){
                    maxDist = Math.max(maxDist,j-i);
                }
            }
        }
        return maxDist;
    }
}
