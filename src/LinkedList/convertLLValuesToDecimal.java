package LinkedList;

import java.util.LinkedList;

public class convertLLValuesToDecimal {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(0);
        ll.add(1);
        int ans = getDecimalValue(ll);
        System.out.println(ans);
    }

    private static int getDecimalValue(LinkedList<Integer> ll) {
        StringBuilder sb = new StringBuilder();
        for(int num : ll){
            sb.append(num);
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
