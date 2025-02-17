package OoPs;

class Person{
    String name;
    String address;
    int age;
}
class Student$ extends Person{
    int marks;
    String grade;
    Student$(String name,String address,int age,int marks,String grade){
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
        System.out.println("Grade : "+grade);

    }
}
public class inheritance {
    public static void main(String[] args) {
        Student$ s = new Student$("Sarthak Vitmal","New Panvel",20,95,"A");
        s.display();
    }
}
