package Arrays;

public class threeDivisors {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                count++;
            }
        }

        if(count == 3) System.out.println(true);
        else System.out.println(false);
    }
}
