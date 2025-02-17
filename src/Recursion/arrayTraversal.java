package Recursion;

public class arrayTraversal {
    public static void print(int i,int[] arr){
        int n = arr.length;
        if(i==n)return;
        System.out.print(arr[i] + " ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,10};
        print(0,arr);
    }
}
