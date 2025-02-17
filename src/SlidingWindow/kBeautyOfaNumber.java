package SlidingWindow;

public class kBeautyOfaNumber {
    public static int divisorSubstrings(int num, int k){
        String s = String.valueOf(num);
        int n = s.length();
        int i = 0;
        int count = 0;
        StringBuilder s1 = new StringBuilder();
        for (int a = i; a < k; a++) {
            s1.append(s.charAt(a));
        }
        int num1 = Integer.parseInt(String.valueOf(s1));
        if(num1 != 0 && num % num1 == 0)count++;
        for (int j = k; j < n; j++) {
            s1.deleteCharAt(0).append(s.charAt(j));
            num1 = Integer.parseInt(s1.toString());
            if(num1 != 0 && num % num1 == 0)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 430043;
        int k = 2;
        int ans = divisorSubstrings(num,k);
        System.out.println(ans);
    }
}
