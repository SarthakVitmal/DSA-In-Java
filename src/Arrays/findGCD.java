package Arrays;

public class findGCD {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int gcd = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)max = arr[i];
            if(arr[i] < min)min = arr[i];
        }
        for (int i = 1; i <= max; i++) {
            if(max % i == 0 && min % i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
