package Methods;
import java.util.*;
class CalulcateSI{
    double calculateSI(int p,float r,int n){
        double sI = (p * n * r) / 100;
        return sI;
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Value : ");
        int principal = sc.nextInt();
        System.out.println("Enter Rate Of Interest : ");
        float rate = sc.nextFloat();
        System.out.println("Enter No Of Years : ");
        int noOfYears = sc.nextInt();

        CalulcateSI si = new CalulcateSI();
        double simpleInterest = si.calculateSI(principal,rate,noOfYears);
        System.out.println("Simple Interest "+simpleInterest);
    }
}
