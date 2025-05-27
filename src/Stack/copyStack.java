package Stack;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println("Original Stack :");
        System.out.println(s1);
        while(!s1.isEmpty()) s2.push(s1.pop());
        System.out.println(s2);
        while(!s2.isEmpty()) s3.push(s2.pop());
        System.out.println("Copy Stack : ");
        System.out.println(s3);
    }
}
