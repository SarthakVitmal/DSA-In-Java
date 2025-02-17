package Strings;

import java.util.Scanner;

public class reverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i=0;
        int j=sb.length()-1;

        while(i<j){
            char ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
