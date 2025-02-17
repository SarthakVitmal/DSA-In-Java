package Strings;

public class returnMaxString {
    public static void main(String[] args) {
        String[] str = {"1200","999","1018","0078"};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            int n = Integer.parseInt(str[i]);
            if(max<n) max = n;
        }
        System.out.println(max+" ");
    }
}
