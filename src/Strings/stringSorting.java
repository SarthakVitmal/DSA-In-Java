package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class stringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        char []ch = str.toCharArray();
        Arrays.sort(ch);

        str = ch.toString();

        for(char ele : ch){
            System.out.print(ele + " ");
        }
    }
}
