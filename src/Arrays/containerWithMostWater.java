package Arrays;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int area = maxArea(arr);
        System.out.println(area);
    }

    private static int maxArea(int[] arr) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0, right = arr.length-1;
        while (left != right){
            int dist = right - left;
            int minHeight = Math.min(arr[left],arr[right]);
            int area = dist * minHeight;
            maxArea = Math.max(area,maxArea);
            if(arr[left] > arr[right])right--;
            else left++;
        }
        return maxArea;
    }
}
