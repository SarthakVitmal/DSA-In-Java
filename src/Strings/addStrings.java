package Strings;

public class addStrings {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        long num1 = (long)(Integer.parseInt(str1));
        long num2 = (long)(Integer.parseInt(str2));

        long res = (long)(num1 + num2);

        String strresult = Long.toString(res);

        System.out.println(strresult);

    }
}
