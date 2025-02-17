package Strings;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s = "fly me to the moon  ";
        int i = s.length() - 1;
        int length = 0;

        while(i>0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        System.out.println(length);
    }
}
