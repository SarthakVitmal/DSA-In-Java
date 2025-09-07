package Arrays;

public class powerOfThree {
    public static void main(String[] args) {
        int n = 27;
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);
    }

    private static boolean isPowerOfThree(int n) {
        if(n == 0)return false;
        for (int i = 0; i <= n; i++) {
            if(Math.pow(3,i) == n)return true;
        }
        return false;
    }
}
