package Recursion;

public class countAndSay {
    public static String countAndSayFunc(int n){
        StringBuilder ans = new StringBuilder();
        if(n == 1)return "1";
        String s = countAndSayFunc(n-1);
        int i=0;int j=0;int len;
        while (j<s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }else{
                len = j - i;
                ans.append(len);
                ans.append(s.charAt(i));
                i = j;
            }
        }
        len = j - i;
        ans.append(len);
        ans.append(s.charAt(i));
        return ans.toString();
    }
    public static void main(String[] args) {
        int n = 5;
        String ans = countAndSayFunc(n);
        System.out.println(ans);
    }
}
