package Arrays;

public class countSymmetricIntegers {
    public static void main(String[] args) {
        int low = 1200;
        int high = 1230;
        int ans = countSymmetric(low, high);
        System.out.println(ans);
    }

    private static int countSymmetric(int low, int high) {
        int count = 0;
        for (int i = low; i <= high ; i++) {
            String s = String.valueOf(i);
            if(s.length() % 2 == 0){
                int leftSum = 0, rightSum = 0;
                for (int j = 0; j < s.length()/2; j++) {
                    leftSum += s.charAt(j);
                }
                for (int j = s.length()/2; j < s.length(); j++) {
                    rightSum += s.charAt(j);
                }
                if(leftSum == rightSum)count++;
            }
        }
        return count;
    }
}
