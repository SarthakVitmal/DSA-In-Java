package OoPs;

class Employee_{
    //Instance Variables
    String name;
    int age;
    Employee_(){
        System.out.println("Employee Constructor Called");
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
public class constructor {
    public static void main(String[] args) {
        Employee_ e = new Employee_();
        e.display();
    }
}
