package Strings;

public class scoreOfAString {
    public static int getAbsDiff(char a,char b){
        return Math.abs((int) a - (int) b);
    }
    public static int getScore(String s){
        int i = 0,j = 1;
        int n = s.length();
        int sum = 0;
        while (j<n){
            sum += getAbsDiff(s.charAt(i),s.charAt(j));
            j++;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "hello";
        int ans = getScore(s);
        System.out.println(ans);
    }
}
