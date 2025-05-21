package BitManipulation;

public class setKthBit {
    public static void main(String[] args) {
        int a = 0b10111001011;
        int k = 5;
        int ans = setBit(a,k);
        System.out.println(ans);
    }
    private static int setBit(int a, int k){
        int masked = 1 << k;
        return a | masked;
    }
}
