package Arrays;

public class singleNonDuplicate {
    public static int singleNonDup(int[] arr){
        int i = 0;
        if(arr.length <= 1)return arr[0];
        while(i<arr.length-1){
            int j = i + 1;
            if(arr[i]!=arr[j])return arr[i];
            if(arr[i] == arr[j]){
                i+=2;
            }
        }
        if(arr[arr.length-1]!=arr[arr.length-2])return arr[arr.length-1];
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,2};
        System.out.println(singleNonDup(arr));
    }
}
