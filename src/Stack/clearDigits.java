package Stack;

import java.util.Stack;

/*
You are given a string s.

Your task is to remove all digits by doing this operation repeatedly:

Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.
 */
public class clearDigits {
    public static void main(String[] args) {
        String s = "abc";
        String ans = clearDig(s);
        System.out.println(ans);
    }

    private static String clearDig(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        Stack<Character> rev = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = ch;
            if((ascii >= 97 && ascii <= 122) || (ascii >= 65 && ascii <= 91))st.push(s.charAt(i));
            else st.pop();
        }

        while (!st.isEmpty()){
            rev.push(st.pop());
        }
        while (!rev.isEmpty()){
            sb.append(rev.pop());
        }
        return sb.toString();
    }
}
