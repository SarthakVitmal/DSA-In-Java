package Strings;

import java.util.Scanner;

public class setCharAtMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(0,'A');
        System.out.println(sb);
    }
}
