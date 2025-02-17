package Strings;

public class stringBuilderFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sarthak");
        StringBuilder sb2 = new StringBuilder("Sarthak");

        System.out.println(sb.compareTo(sb2));
        System.out.println(sb.indexOf("S"));
        System.out.println(sb.lastIndexOf("a"));

    }
}
