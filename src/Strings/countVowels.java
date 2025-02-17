package Strings;

import java.util.Scanner;

public class countVowels {

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int count = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch))
                count++;
        }
        System.out.println("No of vowels : "+count);

    }
}
