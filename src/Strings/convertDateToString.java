package Strings;

public class convertDateToString {
    public static void main(String[] args) {
        String s = "2080-02-29";
        String ans = convertDateToBinary(s);
        System.out.println(ans);
    }

    private static String convertDateToBinary(String s) {
        int i = 0; int j = 0;
        StringBuilder sb;
        StringBuilder ans = new StringBuilder();
        StringBuilder temp;

        while(j < s.length()){
            while(j < s.length() && s.charAt(j) != '-'){
                j++;
            }
            sb = new StringBuilder();
            temp = new StringBuilder();
            for (int k = i; k < j; k++) {
                sb.append(s.charAt(k));
            }
            long num = Long.parseLong(sb.toString());
            while (num > 0){
                long rem = num % 2;
                temp.append(rem);
                num = num / 2;
            }
            temp.reverse();
            ans.append(temp);
            ans.append("-");
            j++;
            i = j;
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
