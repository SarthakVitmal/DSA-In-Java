package LoopsAssignments;

import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }

        if(str.equals(revStr)) System.out.println("String is a palindrome");
        else System.out.println("String is not a palindrome");
        }
}
