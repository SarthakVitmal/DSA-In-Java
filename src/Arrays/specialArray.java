package Arrays;

public class specialArray {
    public static int specialArr(int[] arr){
        for (int x = 1; x <= arr.length; x++) {
            int count = 0;
            for (int nums : arr) if (nums >= x) count++;
            if (x == count) return x;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,9,7,8,3,8,6,6};
        int n = specialArr(arr);
        System.out.println(n);
    }
}
