package Arrays;

public class commonFactors {
    public static int commonMultiples(int a,int b){
        int count = 1;
        for (int i = 2; i <= Math.min(a,b); i++) {
            if(a % i == 0 && b % i == 0)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int res = commonMultiples(a,b);
        System.out.println(res);
    }
}
