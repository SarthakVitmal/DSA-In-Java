package SearchingAlgorithms;

public class squareRoot {
    public static int sqrt(int x){
        int low = 0;
        int high = x;
        int mid = 0;

        while(low<=high){
            mid = (low+high)/2;
            if(mid*mid == x)return mid;
            else if(mid*mid > x)high = mid - 1;
            else if(mid*mid < x)low = mid + 1;
        }return high;
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(sqrt(x));
    }
}
