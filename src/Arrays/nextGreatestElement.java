package Arrays;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,2,49,16,28,21};
        int[] brr = new int[arr.length];
        brr[arr.length-1] = -1;

//        for(int i=0;i<arr.length-1;i++){
//            int max = Integer.MIN_VALUE;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j] > max){
//                    max = arr[j];
//                }
//                brr[i] = max;
//            }
//        }
        int nge = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            brr[i] = nge;
            nge = Math.max(nge,arr[i]);
        }

        for(int ele : brr){
            System.out.print(ele + " ");
        }
    }
}
