package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class twoD_ArrayList {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(50); b.add(60);
        List<Integer> c = new ArrayList<>();
        c.add(70); c.add(90);
        List<Integer> d = new ArrayList<>();

        List<List<Integer>> v = new ArrayList<>();
        v.add(a); v.add(b); v.add(c); v.add(d);

        for(int i=0;i<v.size();i++){
            for(int j=0;j<v.get(i).size();j++){
                System.out.print(v.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
