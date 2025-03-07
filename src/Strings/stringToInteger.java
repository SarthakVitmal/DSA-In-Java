package Strings;

/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.
 */
public class stringToInteger {
    public static void main(String[] args) {
        String s = "-91283472332";
        int ans = myAtoi(s);
        System.out.println(ans);
    }

    private static int myAtoi(String s) {
        s = s.stripLeading();
        if(s.isEmpty())return 0;
        int sign = 1; int idx = 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            idx++;
        }else if(s.charAt(0) == '+')idx++;

        int result = 0;
        while (idx < s.length() && Character.isDigit(s.charAt(idx))){
            int digit = s.charAt(idx) - '0';

            if(result > (Integer.MAX_VALUE - digit) / 10){
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            idx++;
        }
        return result * sign;
    }
}
