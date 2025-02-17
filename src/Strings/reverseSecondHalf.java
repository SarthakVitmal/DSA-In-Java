package Strings;

import java.util.Scanner;

public class reverseSecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a even length string : ");
        String str = sc.nextLine();

        int mid = str.length() / 2;

        for (int i = str.length()-1; i >= mid; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
