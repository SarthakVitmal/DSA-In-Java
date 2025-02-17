package Recursion;

public class generateParenthesis {

    public static void printParenthesis(int open,int close,int n,String ans){
        int len = ans.length();
        if(len == 2*n){
            System.out.println(ans);
            return;
        }
        if(open < n)printParenthesis(open+1,close,n,ans+"(");
        if(open > close) printParenthesis(open,close+1,n,ans+")");
    }
    public static void main(String[] args) {
        int n = 3;
        printParenthesis(0,0,n,"");
    }
}
