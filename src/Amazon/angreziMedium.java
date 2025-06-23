package Amazon;

public class angreziMedium {
    static String[] belowTwenty = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    public static void main(String[] args) {
        int num = 16;
        String ans = convertToWords(num);
        System.out.println(ans);
    }

    private static String convertToWords(int num) {
        if(num < 20)return belowTwenty[num];
        return "";
    }
}
