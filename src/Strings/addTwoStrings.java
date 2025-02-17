package Strings;

import java.math.BigDecimal;

public class addTwoStrings {
    public static void main(String[] args) {
        String num1 = "101";
        String num2 = "10";

        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);

        int num5 = num3 + num4;
        String s2 = String.valueOf(num5);
        System.out.println(s2);
    }
}
