package Arrays;

public class diStringMatch {
    public static int[] diStringMatch(String s){
        int[] res = new int[s.length()+1];
        int low = 0;
        int high = s.length();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I'){
                res[i] = low;
                low++;
            }
            if(s.charAt(i) == 'D'){
                res[i] = high;
                high--;
            }
        }
        res[res.length-1] = low;
        return res;
    }
    public static void main(String[] args) {
        String str = "DDI";
        int[] res = diStringMatch(str);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
