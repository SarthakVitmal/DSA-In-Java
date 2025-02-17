package PrefixSum;

public class maxScore {
    public static int getMaxScore(String s){
        int n = s.length();
        int[] pre = new int[n+1];
        for (int i=1; i<=n; i++) {
            pre[i] += pre[i-1];
            if(s.charAt(i-1) == '1')pre[i] += 1;
        }
        int countZero = 0;
        for (int i=0; i<n; i++) {
            if(s.charAt(i) == '0')countZero++;
        }
        for (int i = 0; i < pre.length; i++) {
            pre[i] += countZero;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < pre.length; i++) {
            max = Math.max(max,pre[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "00111";
        int ans = getMaxScore(s);
        System.out.println(ans);
    }
}
