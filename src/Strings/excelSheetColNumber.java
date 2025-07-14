package Strings;

public class excelSheetColNumber {
    public static void main(String[] args) {
        String columnTitle = "FXSHRXW";
        int ans = titleToNumber(columnTitle);
        System.out.println(ans);
    }

    private static int titleToNumber(String columnTitle) {
        if(columnTitle.length() == 1){
            int ch = columnTitle.charAt(0);
            return ch - 'A' + 1;
        }
        int col = 0;
        int pow = columnTitle.length()-1;
        for (int i = 0; i < columnTitle.length(); i++) {
            col += (int) ((columnTitle.charAt(i) - 'A' + 1) * Math.pow(26,pow));
            pow--;
        }
        return col;
    }
}
