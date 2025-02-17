package Arrays;

public class sort0and1MethodThree {
    public static void swap(int[] arr,int left_ptr,int right_ptr){
        int temp = arr[left_ptr];
        arr[left_ptr] = arr[right_ptr];
        arr[right_ptr] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,0};
        int left_ptr = 0;
        int right_ptr = arr.length - 1;

        while(left_ptr<right_ptr) {
            if(arr[left_ptr] == 0)left_ptr++;
            else if(arr[right_ptr] == 1) right_ptr--;
            else if(arr[left_ptr] > arr[right_ptr]) {
                swap(arr, left_ptr, right_ptr);
                left_ptr++;
                right_ptr--;
            }
        }
        System.out.println("Sorted Array : ");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
