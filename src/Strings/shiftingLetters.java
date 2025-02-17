package Strings;

public class shiftingLetters {
    public static String shiftLetters(String s,int[] arr){
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 2; i >= 0; i--) {
            arr[i] = (arr[i] + arr[i + 1]) % 26;
        }
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int afterShift = (ch - 'a' + arr[i]) % 26 + 'a';
            sb.append((char) afterShift);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        int[] arr = {3,5,9};
        String ans = shiftLetters(s,arr);
        System.out.println(ans);
    }
}
