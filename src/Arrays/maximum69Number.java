package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class maximum69Number {
    public static void main(String[] args) {
        int n = 9969;
        int ans = max69Number(n);
        System.out.println(ans);
    }

    private static int max69Number(int n) {
        char[] num = Integer.toString(n).toCharArray();

        for (int i = 0; i < num.length; i++) {
            if(num[i] == '6'){
                num[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(num));
    }
}
