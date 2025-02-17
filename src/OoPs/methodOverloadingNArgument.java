package OoPs;

class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    void add(int a,int b,int c,int d,int e){
        System.out.println(a+b+c+d+e);
    }
}

class AdvancedCalculator{
    void add(int...args){
        int sum = 0;
        for(int ele : args){
            sum += ele;
        }
        System.out.println(sum);
    }
}

public class methodOverloadingNArgument {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
        c.add(10,20,30);
        c.add(10,20,30,40);
        c.add(10,20,30,40,50);
        System.out.println("--------------------------");
        AdvancedCalculator ac = new AdvancedCalculator();
        ac.add(10,20);
        ac.add(10,20,30);
        ac.add(10,20,30,40);
        ac.add(10,20,30,40,50);
    }
}
