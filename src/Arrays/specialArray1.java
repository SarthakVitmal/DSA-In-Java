package Arrays;

public class specialArray1 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,6};
        boolean isSpecial = isSpecialArray(arr);
        System.out.println(isSpecial);
    }

    private static boolean isSpecialArray(int[] arr) {
        int n = arr.length;
        boolean isSpecial = false;
        if(n ==  1)return true;
        for (int i = 0; i < n-1; i++) {
            if((arr[i] % 2 == 0 && arr[i+1] % 2 == 1) || (arr[i] % 2 == 1 && arr[i+1] % 2 == 0))isSpecial = true;
            else return false;
        }
        return isSpecial;
    }
}
