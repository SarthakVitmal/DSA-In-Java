package Arrays;

public class interleaveFirstHalfWithSecondHalf {
    public static int[] interleave(int[] arr){
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int[] res = new int[n];

        for (int i = 0; i < n/2; i++) a[i] = arr[i];
        for (int i = 0; i < n-n/2; i++) b[i] = arr[i+n/2];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i<a.length && j<b.length){
            res[k++] = a[i++];
            res[k++] = b[j++];
        }
        while (j != b.length)res[k++] = b[j++];
        while (i != a.length)res[k++] = a[i++];
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] res = interleave(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
