package Arrays;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1,1};
        int j = 0;
        int count = 0;
        int maxOnes = 0;

        while(j<arr.length){
            if(arr[j] == 1){
                j++;
                count++;
                maxOnes = Math.max(maxOnes,count);
            }
            else if(arr[j] != 1){
                count = 0;
                j++;
            }
        }
        System.out.println(maxOnes);
    }
}
