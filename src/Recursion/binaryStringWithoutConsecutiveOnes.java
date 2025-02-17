package Recursion;

public class binaryStringWithoutConsecutiveOnes {
    public static void printStrings(int n,String ans){
        int len = ans.length();
        if(len == n){
            System.out.print(ans + " ");
            return;
        }
        if(len == 0 || ans.endsWith("0")){
            printStrings(n,ans+"1");
            printStrings(n,ans+"0");
        }
        else if(ans.endsWith("1")){
            printStrings(n,ans+"0");
        }
    }
    public static void main(String[] args) {
        int n = 2;
        printStrings(n,"");
    }
}
