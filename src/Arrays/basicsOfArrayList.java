//In arraylist default value is not set to zero.
package Arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(5); //add
        arr.add(7);
        arr.add(9);

        System.out.println(arr); //print

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        arr.set(1,11); //modify

        System.out.println(arr);
     }
}
