package BitManipulation;

public class decodeXORArray {
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int first = 4;
        int[] ans = decodeArray(encoded,first);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] decodeArray(int[] encoded, int first) {
        int n = encoded.length;
        int[] decoded = new int[n+1];
        decoded[0] = first;
        for (int i = 1; i < decoded.length; i++) {
            decoded[i] = encoded[i-1] ^ decoded[i-1];
        }
        return decoded;
    }
}
