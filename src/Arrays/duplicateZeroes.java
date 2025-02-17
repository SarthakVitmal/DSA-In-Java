package Arrays;

public class duplicateZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] ans = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length && k <= ans.length-1; i++) {
            if(arr[i] == 0){
                if(k < ans.length - 1) {
                    ans[k] = 0;
                    ans[k + 1] = 0;
                }else ans[k] = 0;
                k+=2;
            }
            else ans[k++] = arr[i];
        }

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
            System.out.print(arr[i] + " ");
        }
    }
}
