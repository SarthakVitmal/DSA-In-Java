package Strings;

public class mergeStringsAlternatively {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "pqrs";
        String ans = mergeAlternatively(s1,s2);
        System.out.println(ans);
    }

    private static String mergeAlternatively(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()){
            sb.append(s1.charAt(i++));
            sb.append(s2.charAt(j++));
        }
        if(i == s1.length()){
            while (j < s2.length()){
                sb.append(s2.charAt(j++));
            }
        }
        if(j == s2.length()){
            while (i < s1.length()){
                sb.append(s1.charAt(i++));
            }
        }
        return sb.toString();
    }
}
