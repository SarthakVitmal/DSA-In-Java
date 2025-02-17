package Strings;

public class stringBuilderInJava {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length());
        System.out.println(s.capacity()); //Initial Capacity of a string declared using String Builder is always 16


        StringBuilder t = new StringBuilder("Sarthak");
        System.out.println(t.capacity());
        System.out.println(t.length());

        StringBuilder u = new StringBuilder(10);
        System.out.println(u.capacity());
    }
}
