package PatternPrinting.Triangle;

public class waveForm {
    public static void main(String[] args) {
        int count1 = 10;
        int count2 = 9;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if(j%2==1){
                    if(j==1) System.out.print(i + " ");
                    else if(i==5 && j==5){
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
                else if(j==4){
                    if (i == 4 && j == 4) {
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
