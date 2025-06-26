package Heaps;

import java.util.PriorityQueue;

public class findScore {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3,2};
        long score = find(arr);
        System.out.println(score);
    }

    private static long find(int[] arr) {
        //brute force
//        boolean[] isMarked = new boolean[arr.length];
//        Arrays.fill(isMarked, false);
//        int score = 0;
//        while (!allMarked(isMarked)){
//            int min = Integer.MAX_VALUE;
//            int minIdx = -1;
//            for (int i = 0; i < arr.length; i++) {
//                if(!isMarked[i] && min > arr[i]) {
//                    min = arr[i];
//                    minIdx = i;
//                }
//            }
//            if(!isMarked[minIdx]){
//                score += arr[minIdx];
//                isMarked[minIdx] = true;
//                if(minIdx > 0)isMarked[minIdx-1] = true;
//                if(minIdx+1 < arr.length)isMarked[minIdx+1] = true;
//            }
//        }
//        return score;
        int n = arr.length;
        boolean[] isMarked = new boolean[n];
        long score = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );
        for (int i=0; i<n; i++) pq.offer(new int[]{arr[i], i});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int val = curr[0];
            int idx = curr[1];
            if (isMarked[idx]) continue;
            score += val;
            isMarked[idx] = true;
            if (idx > 0) isMarked[idx - 1] = true;
            if (idx + 1 < n) isMarked[idx + 1] = true;
        }
        return score;
    }

    private static boolean allMarked(boolean[] arr) {
        for (boolean b : arr) {
            if (!b) return false;
        }
        return true;
    }
}
