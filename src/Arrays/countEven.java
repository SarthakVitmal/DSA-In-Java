package Arrays;

public class countEven {
    public static int sumOfDigits(int num){
        int sum = 0;
        if(num < 10)return num;
        while (num > 0){
            int rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }
    public static int countEvenNo(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(sumOfDigits(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 4;
        int res = countEvenNo(num);
        System.out.println(res);
    }
}
