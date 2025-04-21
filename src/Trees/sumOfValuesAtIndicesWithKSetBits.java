package Trees;

import java.util.ArrayList;

public class sumOfValuesAtIndicesWithKSetBits {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);al.add(10);al.add(1);al.add(5);al.add(2);
        int k = 1;
        int ans = sumIndicesWithKSetBits(al,k);
        System.out.println(ans);
    }

    private static int sumIndicesWithKSetBits(ArrayList<Integer> al, int k) {
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            int temp = i;
            int countOnes = 0;
            while(temp > 0){
                int rem = temp % 2;
                if(rem == 1)countOnes++;
                temp /= 2;
            }
            System.out.println(countOnes);
            if(countOnes == k)sum += al.get(i);
        }
        return sum;
    }
}
