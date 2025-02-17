package Arrays;

import java.util.ArrayList;

public class setMismatch {
    public static int[] findErrorNums(int[] arr){
        ArrayList<Integer> al = new ArrayList<>();
        int[] temp = new int[arr.length+1];

        for (int i = 1; i <= arr.length; i++){
            temp[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == temp[i]){
                if(i > 0 && arr[i] == temp[i-1])al.add(arr[i]);
            }
            else al.add(temp[i]);
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] res = findErrorNums(arr);
    }
}
