package Arrays;

public class thirdMax {
    public static void main(String[] args) {
        int[] arr = {1,2,2,5,3,5};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i])max = arr[i];
        }
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max2 < arr[i] && max != arr[i]) max2 = arr[i];
        }
        int max3 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max3 < arr[i] && (max != arr[i] && max2 != arr[i])) max3 = arr[i];
        }
        System.out.println("3rd Largest Element : "+max3);
    }
}
