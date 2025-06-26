package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class minimumOperationsToHalveArraySum {
    public static void main(String[] args) {
        int[] arr = {5,19,8,1};
        int ops = halveArray(arr);
        System.out.println(ops);
    }

    private static int halveArray(int[] arr) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        int arrSum = 0;
        int operations = 0;
        for(int ele : arr){
            pq.add((double) ele);
            arrSum += ele;
        }
        double currSum = 0;
        while (currSum <= (double) arrSum /2){
            double pop = pq.remove();
            double half = pop / 2;
            pq.add(half);
            currSum += (pop - half);
            operations++;
        }
        return operations;
    }
}
