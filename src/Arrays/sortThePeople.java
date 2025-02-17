package Arrays;

public class sortThePeople {
    public static String[] sortPeople(String[] names,int[] heights){
        int max = Integer.MIN_VALUE;
        String[] ans = new String[10];
        int maxIdx = -1;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                if(heights[j] > max){
                    max = heights[j];
                    maxIdx = j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] height = {180,165,170};
        String[] res = sortPeople(names,height);
    }
}
