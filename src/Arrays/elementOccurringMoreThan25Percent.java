package Arrays;

public class elementOccurringMoreThan25Percent {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,7};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])max = arr[i];
        }
        int[] freq = new int[max+1];
        int[] removeDuplicate = new int[max+1];

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                removeDuplicate[i] = arr[i];
            }
        }
        if(arr[arr.length-1] != arr[arr.length-2])removeDuplicate[removeDuplicate.length-1] = arr[arr.length-1];

        for (int i = 0; i < removeDuplicate.length; i++) {
            System.out.print(removeDuplicate[i] + " ");
        }
        int ele = -1;
        for(int nums : arr){
            freq[nums]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(((freq[i] / (double)arr.length) * 100) > 25){
                ele = freq[i];
                break;
            }
        }
        System.out.println(ele);
    }
}
