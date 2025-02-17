package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class dota2Senate {
    public static String predictPartyVictory(String senate){
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        char[] senateCharArray = senate.toCharArray();
        int n = senate.length();
        for(int i=0;i<senateCharArray.length;i++){
            if(senateCharArray[i] == 'R'){
                r.add(i);
            }else d.add(i);
        }
        while (!r.isEmpty() && !d.isEmpty()){
            if(r.peek() < d.peek()){
                r.add(n++);
            }else d.add(n++);
            r.remove();
            d.remove();
        }
        if(r.isEmpty())return "Dire";
        else return "Radiant";
    }
    public static void main(String[] args) {
        String senate = "RDDDRDRRDR";
        String s = predictPartyVictory(senate);
        System.out.println(s);
    }
}
