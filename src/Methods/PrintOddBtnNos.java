package Methods;

import java.util.Scanner;

class PrintOddNos{
    void printOdd(int a , int b){
        for(int i=a;i<b;i++){
            if(i%2!=0) System.out.print(i+" ");
        }
    }
}

public class PrintOddBtnNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b =sc.nextInt();

        PrintOddNos p = new PrintOddNos();
        p.printOdd(a,b);
    }
}
