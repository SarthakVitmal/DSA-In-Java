package Stack;

import java.util.Scanner;
import java.util.Stack;

public class pushElementAnyIndex {
    static void pushData(Stack<Integer>s1,Stack<Integer>s2,int data,int idx){
        if(idx > s1.size() || idx < 0)throw new Error("Index Out Of Bound");
        while (s1.size() >= idx) s2.push(s1.pop());
        s1.push(data);
        while (!s2.isEmpty()) s1.push(s2.pop());
        System.out.println(s1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1);
        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        System.out.println("Enter the index : ");
        int idx = sc.nextInt();
        pushData(s1,s2,data,idx);
    }
}
