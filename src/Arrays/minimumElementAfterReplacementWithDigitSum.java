package Arrays;

public class minimumElementAfterReplacementWithDigitSum {
    public static void main(String[] args) {
        int[] arr = {10,12,13,14};
        int ans = minElement(arr);
        System.out.println(ans);
    }

    private static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            String s = String.valueOf(arr[i]);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Integer.parseInt(String.valueOf(s.charAt(j)));
            }
            min = Math.min(sum,min);
        }
        return min;
    }
}
