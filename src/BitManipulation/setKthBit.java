package BitManipulation;

public class setKthBit {
    public static void main(String[] args) {
        int a = 0b10111001011;
        int k = 5;
        int ans = setBit(a,k);
        System.out.println(ans);
        int ansu = unsetBit(a,k);
        System.out.println(ansu);
        int anst = toggle(a,k);
        System.out.println(anst);
    }
    private static int setBit(int a, int k){
        int masked = 1 << k;
        return a | masked;
    }
    private static int unsetBit(int a,int k){
        int masked = ~(1 << k);
        return a & masked;
    }
    private static int toggle(int a,int k){
        int masked = 1 << k;
        return a ^ masked;
    }
}
