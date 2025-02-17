package TwoDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {

    public static void generatePascalTriangle(int n){
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) l.add(1);
                else l.add((res.get(i-1).get(j) + res.get(i-1).get(j-1)));
            }
            res.add(l);
        }

        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int n = sc.nextInt();

        generatePascalTriangle(n);
    }
}
