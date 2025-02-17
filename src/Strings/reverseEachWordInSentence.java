package Strings;

import java.util.Scanner;

public class reverseEachWordInSentence {
    public static void reverseWord(StringBuilder sb,int i,int j){
        while(i<j){
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i = 0,j = 0;

        while(j<sb.length()){
            if(sb.charAt(j) != ' ')
                j++;
            else{
               reverseWord(sb,i,j-1);
               i = j + 1;
               j = i;
            }
        }
        reverseWord(sb,i,j-1); //for last word reverse
        System.out.println(sb);
    }
}
