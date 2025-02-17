package Stack;

import java.util.Stack;

public class thousandSeparator {
    public static String thousandSeparate(int n){
        if(n < 1000)return String.valueOf(n);
        String s = String.valueOf(n);
        Stack<Character> st = new Stack<>();
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                count++;
            }else if(Character.isDigit(ch)){
                st.push(ch);
                count++;
            }
            if(count == 3 && i!=0){
                st.push('.');
                count = 0;
            }
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = 123456789;
        String res = thousandSeparate(n);
        System.out.println(res);
    }
}
