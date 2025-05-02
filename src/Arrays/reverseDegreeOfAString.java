package Arrays;

import java.util.HashMap;
public class reverseDegreeOfAString {
    public static void main(String[] args) {
        String s = "abc";
        int ans = reverseDegree(s);
        System.out.println(ans);
    }

    private static int reverseDegree(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            char ch = (char)('a' + i - 1);
            map.put(ch,27-i);
        }
        System.out.println(map);
        int sum = 0;
        for (int i = 1; i <= s.length(); i++) {
            int deg = map.get(s.charAt(i-1));
            sum += deg * i;
            System.out.println(sum);
        }
        return sum;
    }
}
