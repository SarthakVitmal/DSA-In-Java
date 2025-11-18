package Arrays;

public class oneBitAndTwoBitCharacters {
    public static void main(String[] args) {
        int[] bits = {1,0,0};
        boolean isOneBit = isOneBitCharacter(bits);
        System.out.println(isOneBit);
    }

    private static boolean isOneBitCharacter(int[] bits) {
        boolean flag = false;
        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == 1) {
                flag = false;
                i += 1;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}
