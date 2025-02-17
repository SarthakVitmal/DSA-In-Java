package Arrays;

public class maxElementInArray {
    public static void main(String[] args) {
        int[] arr = {12,14,119,89,78};

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max Element : "+max);
    }
}
