package Strings;

public class multiplyStrings {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";
        String ans = multiply(str1,str2);
        System.out.println(ans);
    }

    private static String multiply(String str1, String str2) {
        int[] ans = new int[str1.length()+str2.length()];
        int minLength = minLen(str1.length(),str2.length());
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        
        sb1.reverse();
        sb2.reverse();

        int j = 0;
        for (int i = 0; i < minLength; i++) {
            int res = (int)sb1.charAt(j) * (int)sb2.charAt(i);
            
        }
        return "";
    }

    private static int minLen(int length, int length1) {
        return Math.min(length1,length);
    }
}
