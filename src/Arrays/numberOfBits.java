package Arrays;

/*
Given a positive integer n, write a function that returns the number
of set bits in its binary representation (also known as the Hamming weight).
 */
public class numberOfBits {
    public static void main(String[] args) {
        int n = 11;
        int ans = hammingWeight(n);
        System.out.println(ans);
    }

    private static int hammingWeight(int n) {
        int countOnes = 0;
        while (n != 0){
            if(n % 2 == 1)countOnes++;
            n/=2;
        }
        return countOnes;
    }
}
