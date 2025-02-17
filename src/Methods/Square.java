package Methods;

import java.util.Scanner;

class CalculateSquare{
   void calculate(int n){
        for(int i=1;i<=n;i++){
            int res = i * i;
            System.out.print(res+" ");
        }
    }
}

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        CalculateSquare cs = new CalculateSquare();
        cs.calculate(n);
    }
}
