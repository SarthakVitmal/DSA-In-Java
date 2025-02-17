package PrefixSum;

public class corporateFlightBookings {
    public static int[] getPrefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++)arr[i] = arr[i] + arr[i-1];
        return arr;
    }
    public static int[] corpFlightBookings(int[][] arr,int n){
        int[] ans = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            int first = arr[i][0];
//            int last = arr[i][1];
//            int seats = arr[i][2];
//            for (int j = first-1; j < last; j++) {
//                ans[j] += seats;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int last = arr[i][1];
            int seats = arr[i][2];
            ans[first-1] += seats;
            if(last < ans.length) {
                ans[last+1-1] -= seats;
            }
        }
        getPrefixSum(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[][] bookings = {{1,4,10},{2,3,20},{2,5,25}};
        int n = 5;
        int[] ans = corpFlightBookings(bookings,n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
