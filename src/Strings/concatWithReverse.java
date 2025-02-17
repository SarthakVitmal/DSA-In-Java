package Strings;

import java.util.Scanner;

public class concatWithReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String str2 = "";

        for(int i=str.length()-1;i>=0;i--){
            str2 += str.charAt(i);
        }

        str = str + str2;
        System.out.println(str);
    }
}
