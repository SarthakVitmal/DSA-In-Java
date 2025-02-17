package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String str2 = "";

        for(int i=str.length()-1;i>=0;i--){
            str2 += str.charAt(i);
        }

        if(str.equals(str2)) System.out.println("Strings are palindrome");
        else System.out.println("Strings are not palindrome");
    }
}
