package Arrays;

public class rankTransform {
    public static void main(String[] args) {
        int[] arr = {37,13,28,9,100,56,80,5,12};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int curr = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(curr > arr[j])count++;
                else ans[i] = 1;
            }
            ans[i] = count+1;
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
