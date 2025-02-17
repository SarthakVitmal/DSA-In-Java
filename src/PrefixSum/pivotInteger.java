package PrefixSum;

public class pivotInteger {
    public static int[] prefixSum(int[] arr){
        int[] prefix = arr.clone();
        for (int i = 1; i < prefix.length; i++)prefix[i] = prefix[i] + prefix[i-1];
        return prefix;
    }
    public static int[] suffixSum(int[] arr){
        for (int i = arr.length-2; i >= 0; i--)arr[i] = arr[i] + arr[i+1];
        return arr;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int getPivotInteger(int n){
        if(n==1)return 1;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        int[] pre = prefixSum(arr);
        int[] suff = suffixSum(arr);
        print(pre);
        print(suff);
        for (int i = 0; i < pre.length; i++) {
            if(pre[i] == suff[i])return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 4;
        //       1 2 3 4 5 6 7 8
        // Pre : 1 3 6 10 15 21 28 36
        // Suff : 36 35 33 30 26 21 15 8
        int pivotInt = getPivotInteger(n);
        System.out.println(pivotInt);
    }
}
