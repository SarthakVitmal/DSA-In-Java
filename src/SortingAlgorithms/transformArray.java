package SortingAlgorithms;

public class transformArray {
    public static void main(String[] args) {
        int[]arr = {54,11,28,91,47,63};
        int x = 0;
        for(int j=0;j<arr.length;j++) {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min && arr[i] > 0){
                    min = arr[i];
                    minIdx = i;
                }
            }
            arr[minIdx] = x;
            x--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(-1 *
                    arr[i] + " ");
        }
    }
}
