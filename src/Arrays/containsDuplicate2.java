package Arrays;

public class containsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] arr,int k){
        int i=0;
        while (i<arr.length){
            int j = i+1;
            while(j<arr.length) {
                if (arr[i] == arr[j] && Math.abs(i - j) <= k) {
                    return true;
                } else j++;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;
        boolean result = containsNearbyDuplicate(arr,k);
        if(result) System.out.println(true);
        else System.out.println(false);
    }
}
