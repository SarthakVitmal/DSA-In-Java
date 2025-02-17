package Strings;

public class validPalindrome {
    public static boolean isPalindrome(String s){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch >= 48 && ch <= 57) res.append(s.charAt(i));
        }
        String ans = res.toString().toLowerCase();
        System.out.println(ans);
        int i = 0;
        int j = ans.length()-1;
        while(i < j){
            if(ans.charAt(i) != ans.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "0P";
        boolean res = isPalindrome(s);
        if(res) System.out.println(true);
        else System.out.println(false);
    }
}
