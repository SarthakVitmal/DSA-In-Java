package BitManipulation;

public class minimumBitFlipsToConvert {
    public static void main(String[] args) {
        int start = 10;
        int end = 7;
        int ans = minBitFlips(start,end);
        System.out.println(ans);
    }

    private static int minBitFlips(int start, int end) {
        int xor = start ^ end;
        return Integer.bitCount(xor);
    }
}
