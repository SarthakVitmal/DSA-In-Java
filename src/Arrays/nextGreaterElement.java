package Arrays;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};
        int[] ans = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    found = true;
                }
                if(found && arr1[i] < arr2[j]){
                    ans[i] = arr2[j];
                    break;
                }else ans[i] = -1;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
