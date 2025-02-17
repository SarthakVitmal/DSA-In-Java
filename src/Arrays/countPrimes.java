package Arrays;

public class countPrimes {
    public static void main(String[] args) {
        int n = 100;
        int countPrime = 0;
        if(n <= 2) {
            System.out.println(countPrime);
            return;
        }
        for (int i = 2; i <= n-1; i++) {
            int count = 0;
            for (int j = 2; j <= i ; j++) {
                if(i % j == 0){
                    count++;
                    if(count > 1)break;
                }
            }
            if(count == 1)countPrime++;
        }
        System.out.println(countPrime);
    }
}
