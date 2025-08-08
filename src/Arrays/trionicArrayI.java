package Arrays;

public class trionicArrayI {
    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,6};
        boolean ans = isTrionic(arr);
        System.out.println(ans);
    }

    private static boolean isTrionic(int[] arr) {
        int p; int q; int i = 0;
        boolean isExist1 = false, isExist2 = false, isExist3 = false;
        while (i < arr.length){
            while (i+1 < arr.length && arr[i] < arr[i+1]){
                i++;
            }
            isExist1 = true;
            p = i;
            System.out.println(p);
            while (i+1 < arr.length && arr[i] > arr[i+1]){
                i++;
            }
            isExist2 = true;
            q = i;
            System.out.println(q);
            while (i+1 < arr.length && arr[i] < arr[i+1]){
                i++;
            }
            isExist3 = true;
        }
        if(isExist1 && isExist2 && isExist3)return true;
        return false;
    }
}
