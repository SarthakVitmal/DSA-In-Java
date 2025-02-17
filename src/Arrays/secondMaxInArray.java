package Arrays;

public class secondMaxInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max = arr[i];
        }
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max) max2 = arr[i];
        }
        System.out.println(max2);
    }
}
