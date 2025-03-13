package Arrays;

public class calculateMoney {
    public static void main(String[] args) {
        int n = 20;
        int ans = totalMoney(n);
        System.out.println();
        System.out.println(ans);
    }

    private static int totalMoney(int n) {
        int i=1;
        int sum = 0;
        while (n > 0){
            int days = Math.min(n,7);
            for (int j = 0; j < days; j++) {
                sum += (i+j);
            }
            i++;
            n = n - 7;
        }
        return sum;
    }
}
