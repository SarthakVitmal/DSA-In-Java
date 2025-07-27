package Arrays;

public class countHillsAndValleys {
    public static void main(String[] args) {
        int[] arr = {8,2,5,7,7,2,10,3,6,2};
        //          {-,V,-,H,-,V, H,V,H}
        int ans = countHillValley(arr);
        System.out.println(ans);
    }

    private static int countHillValley(int[] arr) {
        int countHills = 0, countValleys = 0;
        for (int i = 1; i < arr.length-1; i++) {
            int leftHillIdx = -1; int rightHillIdx = -1;
            int leftValleyIdx = -1; int rightValleyIdx = -1;
            for (int j = i-1; j >= 0; j--) {
                if(arr[j] < arr[i]){
                    leftHillIdx = j;
                    break;
                }
                else if(arr[j] > arr[i]){
                    leftValleyIdx = j;
                    break;
                }
            }
            if(leftHillIdx != -1){
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j] > arr[i]) break;
                    if(arr[j] < arr[i]){
                        rightHillIdx = j;
                        break;
                    }
                }
            } else if (leftValleyIdx != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j] < arr[i]) break;
                    if(arr[j] > arr[i]){
                        rightValleyIdx = j;
                        break;
                    }
                }
            }
            if(arr[i] != arr[i-1] && leftHillIdx != -1 && rightHillIdx != -1){
                if(arr[i] > arr[leftHillIdx] && arr[i] > arr[rightHillIdx]){
                    countHills++;
                    System.out.println("Hills "+arr[i]);
                }
            }
            if(arr[i] != arr[i-1] && leftValleyIdx != -1 && rightValleyIdx != -1){
                if(arr[i] < arr[leftValleyIdx] && arr[i] < arr[rightValleyIdx]){
                    countValleys++;
                    System.out.println("Valleys " +arr[i]);
                }
            }
        }
        return countHills + countValleys;
    }
}
