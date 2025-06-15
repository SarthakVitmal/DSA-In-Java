package Strings;

public class checkIfBinaryStringHasAtMostOneSegmentOfOnes {
    public static void main(String[] args) {
        String s = "1101011";
        boolean ans = checkOnesSegment(s);
        System.out.println(ans);
    }

    private static boolean checkOnesSegment(String s) {
        int i = 0, n = s.length();
        int count = 0;
        while (i < n){
            if(s.charAt(i) == '1'){
                while (i < n && s.charAt(i) == '1'){
                    i++;
                }
                count++;
            }
            else i++;
        }
        System.out.println(count);
        if(count <= 1)return true;
        return false;
    }
}
