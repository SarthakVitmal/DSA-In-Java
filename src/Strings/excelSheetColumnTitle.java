package Strings;

public class excelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 28;
        String ans = convertToTitle(columnNumber);
        System.out.println(ans);
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0){
            columnNumber -= 1;
            char rem = (char) ('A' + (columnNumber % 26));
            sb.append(rem);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
