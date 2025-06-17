package Heaps;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.PriorityQueue;

public class largestNumberAfterDigitsSwapsByParity {
    public static void main(String[] args) {
        int num = 1234;
        int ans = largestInteger(num);
        System.out.println(ans);
    }

    private static int largestInteger(int num) {
        String s = String.valueOf(num);
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < s.length(); i++) {
            if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0)even.add((int) s.charAt(i) - '0');
            else odd.add((int)s.charAt(i) - '0');
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0)sb.append(even.poll());
            else sb.append(odd.poll());
        }
        return Integer.parseInt(sb.toString());
    }
}
