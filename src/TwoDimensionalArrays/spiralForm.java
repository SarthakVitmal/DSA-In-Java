package TwoDimensionalArrays;

public class spiralForm {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};
        int m = arr.length;
        int n = arr[0].length;

        int minr = 0;
        int maxr = m - 1;
        int minc = 0;
        int maxc = n - 1;

        while(minr<=maxr && minc<=maxc){
            //left to right
            for(int j=minc;j<=maxc;j++){
                System.out.print(arr[minr][j] + " ");
            }minr++;

            if(minr>maxr || minc>maxc)break;

            //top to bottom
            for(int i=minr;i<=maxr;i++){
                System.out.print(arr[i][maxc] + " ");
            }maxc--;

            if(minr>maxr || minc>maxc)break;

            //right to left
            for(int j=maxc;j>=minc;j--){
                System.out.print(arr[maxr][j] + " ");
            }maxr--;

            if(minr>maxr || minc>maxc)break;

            //bottom to top
            for(int i=maxr;i>=minr;i--){
                System.out.print(arr[i][minc] + " ");
            }minc++;

        }
    }
}
