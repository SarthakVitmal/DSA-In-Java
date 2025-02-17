package Arrays;
import java.util.*;

public class findSingleNumber {
    public static void main(String[] args) {
        int[] arr = {3,3,1,1,2,2,5};
        int result = 0;

        for(int num : arr) {
            result ^= num;
        }
        System.out.println(result);
    }
}
