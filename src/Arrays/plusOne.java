package Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num);
        }
        int num = Integer.parseInt(sb.toString());
        num = num + 1;
        String str = Integer.toString(num);
        int[] ans = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ans[i] = Character.getNumericValue(str.charAt(i));
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
