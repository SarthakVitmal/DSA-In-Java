package Arrays;

public class firstBadVersion {
    public static void main(String[] args) {
        int n = 1;
        int bad = 1;
        int ans = firstBad(n,bad);
        System.out.println(ans);
    }

    private static int firstBad(int n, int bad) {
        int low = 0; int high = n;

        while (low <= high){
            int mid = (low + high) / 2;
            if(mid == bad)return mid;
            if(mid < bad)low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}
