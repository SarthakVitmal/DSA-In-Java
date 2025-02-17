package Strings;

public class romanToInt {
    public static int roToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I')sum += I;
            if(s.charAt(i) == 'V')sum += V;
            if(s.charAt(i) == 'X')sum += X;
            if(s.charAt(i) == 'L')sum += L;
            if(s.charAt(i) == 'C')sum += C;
            if(s.charAt(i) == 'D')sum += D;
            if(s.charAt(i) == 'M')sum += M;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int res = roToInt(s);
        System.out.println(res);
    }
}
