package Arrays;
import java.util.Arrays;

public class maxFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4};
        Arrays.sort(arr);
        int distinctEle = 0;
        int i = 0; int j = 0;

        while(i < arr.length-1){
            j = i+1;
            if(arr[i] != arr[j]){
                distinctEle++;
            }
            i=j;
        }
        int []freq = new int[distinctEle+1];
        i = 0; j = 0;int k = 0;
        int occurrence = 0;
        while(i<arr.length){
            j = i + 1;
            while(j < arr.length && arr[i] == arr[j]){
                j++;
            }
            occurrence = j - i;
            freq[k++] = occurrence;
            i = j;
        }
        for (int l = 0; l < freq.length; l++) {
            System.out.print(freq[l] + " ");
        }
        int totalMaxFreq = 0;
        int count = 0;

        for (int l = 0; l < freq.length; l++) {
            if (freq[l] > totalMaxFreq)
                totalMaxFreq = freq[l];
        }

        for (int l = 0; l < freq.length; l++) {
            if (freq[l] == totalMaxFreq)
                count++;
        }

        System.out.println();
        System.out.println(totalMaxFreq * count);
    }
}
