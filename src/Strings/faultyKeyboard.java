package Strings;

public class faultyKeyboard {
    public static String finalString(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) != 'i')sb.append(s.charAt(i));
            if(s.charAt(i) == 'i'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "string";
        String ans = finalString(s);
        System.out.println(ans);
    }
}
