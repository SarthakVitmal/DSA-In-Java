package Methods;

import java.util.Scanner;

class Calculate{
    int countDigits(int num){
        int count = 0;
        int rem;

        while(num != 0){
            rem = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    int square(int num){
        return num * num;
    }
}

public class CountDigitsandPrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        Calculate c = new Calculate();
        int count = c.countDigits(n);
        System.out.println("Count : "+count);
        int square = c.square(count);
        System.out.println("Square : "+square);
    }
}
