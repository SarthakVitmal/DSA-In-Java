package BitManipulation;

public class hammingWeight {
    public static int hammingWt(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            int mask = 1 << i;
            if((n&mask) != 0)count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 0b111111;
        System.out.println(hammingWt(a));
    }
}
