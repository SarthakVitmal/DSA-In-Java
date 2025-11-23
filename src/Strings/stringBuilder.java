package Strings;

public class stringBuilder {
    public static void main(String[] args) {
        String s = "Sarthak";
        convertToStringBuilder(s);
    }

    private static void convertToStringBuilder(String s) {
        //converting string to stringbuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb.substring(0,5));
        //convert stringbuilder to string
        String s1 = sb.reverse().toString();
        System.out.println(s1);

    }
}
