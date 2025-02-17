package Arrays;

public class addDigits {
    public static void main(String[] args) {
        int n = 3;
        int sum;
        while (n >= 10){
            sum = 0;
            while (n > 0){
                int rem = n % 10;
                sum += rem;
                n = n / 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
