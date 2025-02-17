package Strings;

import java.util.ArrayList;

public class fizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        String []arr = new String[n];
        //Creating an array of size n;
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0)arr[i-1] = "FizzBuzz";
            else if(i % 3 == 0)arr[i-1] = "Fizz";
            else if(i % 5 == 0)arr[i-1] = "Buzz";
            else arr[i-1] = String.valueOf(i);
        }

        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            al.add(arr[i]);
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
