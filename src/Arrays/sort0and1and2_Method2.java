package Arrays;

public class sort0and1and2_Method2 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,2,1,0,0};
        int noOfZero = 0;
        int noOfOne = 0;
        int noOfTwo = 0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) noOfZero++;
            else if(arr[i] == 1) noOfOne++;
            else noOfTwo++;
        }

        for(int i=0;i<arr.length;i++){
            if(i<noOfZero) System.out.print("0" + " ");
            else if(i<noOfZero+noOfOne) System.out.print("1" + " ");
            else System.out.print("2" + " ");
        }
    }
}
