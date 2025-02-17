package PatternPrinting.Triangle;

public class waveFormOptimized {
    public static void main(String[] args) {
        int n = 5;
        int count1 = 2*n;
        int count2 = 2*n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j%2==1){
                    if(j==1) System.out.print(i + " ");
                    else if(i==n && j==n){
                        System.out.print(count1+1);
                    }
                    else{
                        System.out.print(count1 + " ");
                        count1++;
                    }
                }
                else if((j%2 == 0 && j == 2)) {
                    System.out.print(count2 + " ");
                    count2--;
                }
                else if(j==n-1){
                    if (i == n-1 && j == n-1) {
                        System.out.print(count1 + 2);
                    }
                    else {
                        System.out.print(count1 + " ");
                        count1++;
                    }
                }
            }
            System.out.println();
        }
    }
}
