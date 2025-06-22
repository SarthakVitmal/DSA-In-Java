package Strings;

import java.util.ArrayList;

public class divideStringIntoGroupsOfSizeK {
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] ans = divideString(s,k,fill);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static String[] divideString(String s, int k, char fill) {
        ArrayList<String> al = new ArrayList<>();
        int i = 0;
        int count = k;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()){
            if(count != 0)sb.append(s.charAt(i));
            if(count == 0){
                count = k;
                al.add(sb.toString());
                sb = new StringBuilder();
                sb.append(s.charAt(i));
            }
            count--;
            i++;
        }
        if(sb.length() == k)al.add(sb.toString());
        else{
            while (sb.length() != k)sb.append(fill);
            al.add(sb.toString());
        }
        String[] ans = new String[al.size()];
        for (int j = 0; j < al.size(); j++) {
            ans[j] = al.get(j);
        }
        return ans;
    }
}
