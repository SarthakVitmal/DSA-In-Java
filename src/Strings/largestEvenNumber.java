package Strings;

public class largestEvenNumber {
    public static void main(String[] args) {
        String s = "1";
        String res = largestEven(s);
        System.out.println(res);
    }

    private static String largestEven(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length()-1; i >= 0; i--) {
            if(Integer.parseInt(String.valueOf(sb.charAt(i))) % 2 == 0)return sb.toString();
            else sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}
