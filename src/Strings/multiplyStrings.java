package Strings;

public class multiplyStrings {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";
        String ans = multiply(str1,str2);
        System.out.println(ans);
    }

    private static String multiply(String str1, String str2) {
        double num1 = Integer.parseInt(str1);
        double num2 = Integer.parseInt(str2);
        int ans = (int)(num1*num2);
        return String.valueOf(ans);
    }
}
