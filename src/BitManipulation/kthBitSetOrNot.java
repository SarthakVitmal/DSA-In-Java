package BitManipulation;

public class kthBitSetOrNot {
    public static void main(String[] args) {
         int a = 0b1111;
         int k = 3;
         boolean ans = isBitSet(a,k);
        System.out.println(ans);
    }

    private static boolean isBitSet(int a, int k) {
        int masked = 1 << k;
        if((a & masked) != 0)return false;
        return true;
    }
}
