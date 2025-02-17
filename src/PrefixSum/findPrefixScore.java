package PrefixSum;

public class findPrefixScore {
    public static int max(int[] arr,int i,int j){
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            if(arr[k] > max)max = arr[k];
        }
        return max;
    }
    public static int[] conversionArray(int[] arr){
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] + max(arr,0,i);
        }
        return res;
    }
    public static int[] getScoreArray(int[] arr){
        if(arr.length == 1)return arr;
        for (int i = 1; i < arr.length; i++)arr[i] = arr[i] + arr[i-1];
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,7,5,10};
        int[] converArray = conversionArray(arr);
        int[] sumArray = getScoreArray(converArray);
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }
}
