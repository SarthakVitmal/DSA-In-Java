package Arrays;

import java.util.ArrayList;

public class kthDistinctString {
    public static String kthDistinct(String[] arr,int k){
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String ch = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(ch.equals(arr[j]))count++;
            }
            if(count == 1)al.add(ch);
        }

        if(k <= al.size())return al.get(k-1);
        else return "";
    }
    public static void main(String[] args) {
        String[] arr = {"a","b","a"};
        String res = kthDistinct(arr,3);
        System.out.println(res);
    }
}
