package Arrays;

import java.util.Arrays;

public class uniqueNumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        int minElement = Arrays.stream(arr).min().getAsInt();
        int[] freq = new int[2 * arr.length];
        Arrays.sort(arr);
        boolean flag = true;
        for(int nums : arr){
            freq[nums - minElement]++;
        }
        for (int i = 0; i < freq.length-1; i++) {
            if(freq[i]!=0) {
                for (int j = i+1; j < freq.length; j++) {
                    if (freq[i] == freq[j]) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
        if(flag) System.out.println(true);
        else System.out.println(false);
    }
}
