package Methods;
import java.util.*;
class CalculateArea{
    double calculate(int radius){
        double area = 3.142 * radius * radius;
        return area;
    }
}

class CalculatePerimeter{
    double calculate(int radius){
        double perimeter = 2 * 3.142 * radius;
        return perimeter;
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculateArea c = new CalculateArea();
        CalculatePerimeter p = new CalculatePerimeter();
        System.out.println("Enter the radius : ");
        byte r = sc.nextByte();
        double area = c.calculate(r);
        System.out.println("Area Of Circle : "+area);
        double perimeter = p.calculate(r);
        System.out.println("Perimeter Of Circle : "+perimeter);
    }
}
