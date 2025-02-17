package Strings;

public class repeatedCharacter {
    public static char repeatedChar(String s){
        char[] ch = s.toCharArray();
        int[] arr = new int[256];
        for(char c : ch) {
            arr[c]++;
            if (arr[c] > 1) return c;
        }
        return 's';
    }
    public static void main(String[] args) {
        String s = "abccbaacz";
        char res = repeatedChar(s);
        System.out.println(res);
    }
}
