package Strings;

import java.util.HashMap;

public class longPressedName {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";
        boolean ans = isLongPressedName(name,typed);
        System.out.println(ans);
    }

    private static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                System.out.println(i + " " + j);
                i++;
                j++;
            }else if(j > 0 && typed.charAt(j) == typed.charAt(j-1)){
                System.out.println(i + " " + j);
                j++;
            }
            else return false;
        }
        return i == name.length();
    }
}
