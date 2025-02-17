package Arrays;
//Remaining
public class sort0and1and2_DutchFlagAlgo {

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,0,1,2,1,0};
        int low = 0,mid =0,high = arr.length - 1;

        while (mid<=high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
        for(int ele : arr) System.out.print(ele + " ");
    }
}
