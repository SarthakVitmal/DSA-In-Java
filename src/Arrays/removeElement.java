package Arrays;

public class removeElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int j = 0;
        int k = 2;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != k){
                arr[j] = arr[i];
                System.out.print(arr[j] +" ");
                j++;
            }
        }
    }
}
