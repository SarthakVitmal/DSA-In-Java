package Arrays;

public class maxDifferenceByRemappingDigit {
    public static void main(String[] args) {
        int num = 90;
        int ans = minMaxDifference(num);
        System.out.println(ans);
    }

    private static int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        int firstNon9Digit = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 9){
                firstNon9Digit = arr[i];
                break;
            }
        }
        int firstNon0Digit = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                firstNon0Digit = arr[i];
                break;
            }
        }
        //Converting first Non Nine Digit to 9 to get the max number
        StringBuilder maxSb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == firstNon9Digit) maxSb.append(9);
            else maxSb.append(arr[i]);
        }
        //Converting first Non Zero Digit to 0 to get the min number
        StringBuilder minSb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == firstNon0Digit) minSb.append(0);
            else minSb.append(arr[i]);
        }
        return Integer.parseInt(maxSb.toString()) - Integer.parseInt(minSb.toString());
    }
}
