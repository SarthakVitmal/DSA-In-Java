package Arrays;

public class findNumberWithEvenDigits {
    public static int findNumbers(int[] arr){
        int countEven = 0;
        int countDigits;
        for (int i = 0; i < arr.length; i++) {
            countDigits = 0;
            while(arr[i] > 0){
                arr[i] /= 10;
                countDigits++;
            }
            if(countDigits % 2 == 0)countEven++;
        }
        return countEven;
    }
    public static void main(String[] args) {
        int[] arr = {56,901,482,1771,1234};
        int res = findNumbers(arr);
        System.out.println(res);
    }
}
