package Heaps;
import java.util.HashMap;
import java.util.PriorityQueue;

class Two implements Comparable<Two>{
    char ch;
    int freq;
    Two(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
    public int compareTo(Two t){
        if(this.freq == t.freq)return this.ch - t.ch;
        else return t.freq - this.freq;
    }
}
public class sortCharactersByFreq {
    private static String frequencySort(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }else map.put(s.charAt(i),1);
        }
        PriorityQueue<Two> pq = new PriorityQueue<>();
        for(char ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new Two(ele,freq));
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            Two t = pq.remove();
            sb.append(String.valueOf(t.ch).repeat(t.freq));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Aabb";
        String ans = frequencySort(s);
        System.out.println(ans);
    }
}
