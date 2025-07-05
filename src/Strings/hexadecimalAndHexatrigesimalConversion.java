package Strings;

public class hexadecimalAndHexatrigesimalConversion {
    public static void main(String[] args) {
        int n = 36;
        String ans = concatHex36(n);
        System.out.println(ans);
    }

    private static String concatHex36(int n) {
        int square = (int) Math.pow(n,2);
        int cube = (int) Math.pow(n,3);
        StringBuilder hdecimal = new StringBuilder();
        while (square > 0){
            int rem = square % 16;
            if(rem < 10) hdecimal.append(rem);
            else hdecimal.append((char)('A' + rem - 10));
            square /= 16;
        }
        StringBuilder htrid = new StringBuilder();
        while (cube > 0) {
            int rem = cube % 36;
            if (rem < 10) htrid.append(rem);
            else htrid.append((char) ('A' + rem - 10));
            cube /= 36;
        }
        String s1 = hdecimal.reverse().toString();
        String s2 = htrid.reverse().toString();
        return s1+s2;
    }
}
