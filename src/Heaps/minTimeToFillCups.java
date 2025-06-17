package Heaps;

public class minTimeToFillCups {
    public static void main(String[] args) {
        int[] amount = {1,4,2};
        int time = fillCups(amount);
        System.out.println(time);
    }

    private static int fillCups(int[] amount) {
        int max = Math.max(amount[0],Math.max(amount[1],amount[2]));
        int total = amount[0] + amount[1] + amount[2];
        return Math.max(max,(int)Math.ceil(total/2.0));
    }
}
