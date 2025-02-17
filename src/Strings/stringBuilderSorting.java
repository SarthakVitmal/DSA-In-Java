package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class stringBuilderSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        char []ch = sb.toString().toCharArray();

        Arrays.sort(ch);

        for(char ele : ch){
            System.out.print(ele + " ");
        }

    }
}
