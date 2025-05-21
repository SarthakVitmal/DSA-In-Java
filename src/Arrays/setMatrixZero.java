package Arrays;

import java.util.HashSet;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
    }

    private static void setZeroes(int[][] arr) {
        HashSet<Integer> setRowsZeroes = new HashSet<>();
        HashSet<Integer> setColsZeroes = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    setRowsZeroes.add(i);
                    setColsZeroes.add(j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(setRowsZeroes.contains(i) || setColsZeroes.contains(j)){
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
