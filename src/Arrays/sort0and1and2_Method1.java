package Arrays;

public class sort0and1and2_Method1 {

    public static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int []arr = {0,2,1,2,1,0,2,1};
        int left_ptr = 0;
        int right_ptr = arr.length - 1;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
