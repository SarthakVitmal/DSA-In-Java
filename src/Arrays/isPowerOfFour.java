package Arrays;

public class isPowerOfFour {
    public static boolean isPower(int n){
        for (int i = 0; i < 100; i++) {
            if(Math.pow(4,i) == n)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPower(n));
    }
}
