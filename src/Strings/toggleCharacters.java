package Strings;

import java.util.Scanner;

public class toggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){
                char ch = sb.charAt(i);
                sb.setCharAt(i,(char)(ch+32));
            } else {
                char ch = sb.charAt(i);
                sb.setCharAt(i,(char)(ch-32));
            }
        }
        System.out.println(sb);
    }
}
