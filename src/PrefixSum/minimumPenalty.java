package PrefixSum;

public class minimumPenalty {
    public static int bestClosingTime(String s){
        int n = s.length();
        //Make prefix array of "N"
        int[] pre = new int[n+1];
        for (int i=1; i<=n; i++) {
            pre[i] += pre[i-1];
            if(s.charAt(i-1) == 'N'){
                pre[i] += 1;
            }
        }
        //Make suffix array of "Y"
        int[] suff = new int[n+1];
        for (int i=n-1 ; i>=0 ; i--) {
            suff[i] += suff[i+1];
            if(s.charAt(i) == 'Y'){
                suff[i] += 1;
            }
        }
        //Merge prefix and suffix array
        int[] merge = new int[pre.length];
        int min = n+5;
        for (int i=0; i<pre.length; i++) {
            merge[i] = pre[i] + suff[i];
            min = Math.min(min,merge[i]);
        }

        for (int i=0; i<pre.length; i++) {
            if(merge[i] == min)return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        String customers = "YYNY";
        int bct = bestClosingTime(customers);
        System.out.println(bct);
    }
}
