package Strings;

import java.util.Scanner;

public class inputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
