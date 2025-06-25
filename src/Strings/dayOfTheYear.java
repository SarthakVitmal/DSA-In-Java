package Strings;

public class dayOfTheYear {
    public static void main(String[] args) {
        String date = "2019-01-09";
        int ans = dayOfYear(date);
        System.out.println(ans);
    }

    private static int dayOfYear(String date) {
        String[] words = date.split("-");
        int year = Integer.parseInt(String.valueOf(words[0]));
        int month = Integer.parseInt(String.valueOf(words[1]));
        int day = Integer.parseInt(String.valueOf(words[2]));
        int[] ordinalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};

        int sum = 0;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            for (int i = 0; i < month-1; i++) {
                sum += leapYear[i];
            }
        }else{
            for (int i = 0; i < month-1; i++) {
                sum += ordinalYear[i];
            }
        }
        sum += day;
        return sum;
    }
}
