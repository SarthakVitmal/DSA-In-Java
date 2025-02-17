package Arrays;

public class happyNumber {
    public static void main(String[] args) {
        boolean[] seen = new boolean[1000]; // Array to keep track of seen numbers
        int n = 2;
        while (n != 1 && !seen[n]){
            seen[n] = true;
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                sum += (int) Math.pow(rem,2);
                n = n / 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
