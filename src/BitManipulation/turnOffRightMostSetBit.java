package BitManipulation;

public class turnOffRightMostSetBit {
    public static void main(String[] args) {
        int a = 0b10111;
        turnOff(a);
    }

    //Method-1: n&n-1
    private static void turnOff(int a) {
        int b = a - 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a&b);
    }
}
