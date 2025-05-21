package BitManipulation;

public class swapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("a="+a+" "+"b="+b);
        swap(a,b);
    }
    private static void swap(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a="+a+" "+"b="+b);
    }
}
