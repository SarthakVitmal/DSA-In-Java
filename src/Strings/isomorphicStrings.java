package Strings;

import java.util.Scanner;

public class isomorphicStrings {
    public static boolean checkIsomorphic(String s,String t){
        char []arr = new char[128];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch;
            if(arr[idx] == '\0') arr[idx] = dh;
            else{
                if(arr[idx] != dh) return false;
            }
        }

        for(int i=0;i<128;i++){
            arr[i] = '\0';
        }

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;
            if (arr[idx] == '\0') arr[idx] = dh;
            else {
                if (arr[idx] != dh) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String s = sc.nextLine();
        System.out.println("Enter the second string : ");
        String t = sc.nextLine();
        boolean flag = checkIsomorphic(s,t);
        if(flag == true){
            System.out.println("Strings are isomorphic");
        }else
            System.out.println("Strings are not isomorphic");
    }
}
