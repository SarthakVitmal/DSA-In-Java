package Strings;

public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s,arr);
        System.out.println(ans);
    }

    private static String restoreString(String s, int[] arr) {
        StringBuilder t = new StringBuilder(s);
        for (int i = 0; i < t.length(); i++) {
            int idx = getIdx(arr,i);
            t.setCharAt(i,s.charAt(idx));
        }
        return t.toString();
    }

    private static int getIdx(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == ele)return i;
        }
        return 0;
    }
}
