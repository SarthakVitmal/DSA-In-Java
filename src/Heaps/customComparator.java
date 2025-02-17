package Heaps;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int rollNo;
    double percentage;
    String name;
    Student(int rollNo,double percentage,String name){
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }
    public int compareTo(Student s){
        return (int) (this.percentage-s.percentage);
    }

}
public class customComparator {
    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name + " ");
            System.out.print(arr[i].rollNo + " ");
            System.out.print(arr[i].percentage + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(76,89,"Sarthak");
        s[1] = new Student(77,79,"Yash");
        s[2] = new Student(78,99,"Saket");
        s[3] = new Student(79,89,"Omkar");

        print(s);
        Arrays.sort(s);
        print(s);
    }
}
