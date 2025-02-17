package Stack;

import java.util.Objects;
import java.util.Stack;

public class backSpaceCompare {
    public static boolean backSpaceCompare(String s,String t){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(st.isEmpty() && ch == '#')continue;
            if(st.isEmpty() || ch >= (int)'a' && ch <= (int)'z')st.push((int)ch);
            if(!st.isEmpty() && ch == '#'){
                st.pop();
            }
        }
        System.out.println(st);
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(rt.isEmpty() && ch == '#')continue;
            else if(rt.isEmpty() || ch >= (int)'a' && ch <= (int)'z')rt.push((int)ch);
            else if(!rt.isEmpty() && ch == '#'){
                rt.pop();
            }
        }
        System.out.println(rt);
        if(st.size() != rt.size())return false;
        while (!st.isEmpty()){
            if(!Objects.equals(st.pop(), rt.pop()))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        boolean res = backSpaceCompare(s,t);
        System.out.println(res);
    }
}
