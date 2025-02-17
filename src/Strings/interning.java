package Strings;
public class interning {
    public static void main(String[] args) {
        String s = "Sarthak";
        String q = "Sarthak";
        //Here a separate string is not created for 'q' variable it is pointing to same as 's' variable.
        //It is used when multiple string are created with same data and hence reducing memory space.
        String t = new String("Sarthak");
        //By declaring the string using above type a new string will be created with different 'Sarthak' value inside.
        System.out.println(t);
    }
}
