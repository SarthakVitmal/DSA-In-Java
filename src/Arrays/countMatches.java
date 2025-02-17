package Arrays;

public class countMatches {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(numberOfMatches(n));
    }

    private static int numberOfMatches(int n) {
        int totalMatches = 0;
        while (n != 1){
            if(n % 2 == 0){
                int match = n / 2;
                totalMatches += match;
                n = n / 2;
            }if(n % 2 == 1){
                int match = (n-1) / 2;
                totalMatches += match;
                n = ((n-1) / 2)+1;
            }
        }
        return totalMatches;
    }
}
