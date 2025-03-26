package Strings;

public class numberOfEvenOddBits {
    public static void main(String[] args) {
        int n = 50; //110010
        int[] ans = evenOdd(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "");
        }
    }

    private static int[] evenOdd(int n) {
        int[] ans = new int[2];
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(i % 2 == 0 && sb.charAt(i) == '1')countEven++;
            else if(i % 2 == 1 && sb.charAt(i) == '1')countOdd++;
        }
        ans[0] = countEven;
        ans[1] = countOdd;
        return ans;
    }
}
