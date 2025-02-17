package Arrays;

public class sort0and1MethodTwo {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,0,1,1,0,1};
        int noOfZeros = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) noOfZeros++;
        }

        for(int i=0;i<arr.length;i++){
            if(i<noOfZeros) System.out.print("0" + " ");
            else System.out.print("1" + " ");
        }
    }
}
