package Strings;

public class removeTrailingZeroes {
    public static void main(String[] args) {
        String s = "123";
        String ans = removeZeroes(s);
        System.out.println(ans);
    }

    private static String removeZeroes(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while (i != 0){
            while (s.charAt(i) == '0'){
                i--;
            }
            if(s.charAt(i) != '0'){
                while (i != 0){
                    sb.append(s.charAt(i));
                    i--;
                }
            }
        }
        sb.append(s.charAt(0));
        return sb.reverse().toString();
    }
}
