package Arrays;

public class digitGame {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10};
        boolean ans = canAliceWin(arr);
        System.out.println(ans);
    }

    private static boolean canAliceWin(int[] arr) {
        int singleDigits = 0;
        int doubleDigits = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 9)doubleDigits += arr[i];
            else singleDigits += arr[i];
        }
        if(singleDigits == doubleDigits)return false;
        return true;
    }
}
