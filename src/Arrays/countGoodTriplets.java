package Arrays;

public class countGoodTriplets {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int a = 7;int b = 2;int c = 3;
        int goodTriplets = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c){
                        goodTriplets++;
                    }
                }
            }
        }
        System.out.println(goodTriplets);
    }
}
