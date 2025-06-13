package Strings;

public class maxOddBinaryNumber {
    public static void main(String[] args) {
        String s = "010";
        String ans = maximumOddBinaryNumber(s);
        System.out.println(ans);
    }

    private static String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int countOnes = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1')countOnes++;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            if(count != countOnes-1){
                sb.append('1');
                count++;
            }
            else sb.append('0');
        }
        sb.append('1');
        System.out.println(sb);
        return sb.toString();
    }
}
