package Arrays;

public class smallestEvenMultiple {
    public static void main(String[] args) {
        int n = 6;
        int evenMultiple = 0;
        for(int i = 1; true; i++){
            n *= i;
            if(n % 2 == 0){
                evenMultiple = n;
                break;
            }
        }
        System.out.println(evenMultiple);
    }
}
