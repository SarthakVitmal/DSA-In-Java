package TwoDimensionalArrays;

public class waveForm2 {
    public static void display(int[][]arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            int low = 0;
            int high = n - 1;
            while(low<high){
                int temp = arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high] = temp;
                low++;
                high--;
            }
        }
        display(arr);
    }
}
