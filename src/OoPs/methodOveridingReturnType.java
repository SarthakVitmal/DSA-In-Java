package OoPs;
class Parent1 {
    public Object methodOne(){
        return null;
    }
}
class Child1 extends Parent1 {
    public String methodOne(){
        System.out.println("Say Hello");
        return null;
    }
}
public class methodOveridingReturnType {
    public static void main(String[] args) {
        Parent1 p5 = new Child1();
        p5.methodOne();
    }
}
