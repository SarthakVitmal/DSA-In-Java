package Strings;

public class checkIfDigitsAreEqual {
    public static void main(String[] args) {
        String s = "3902";
        boolean ans = hasSameDigits(s);
        System.out.println(ans);
    }

    private static boolean hasSameDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 2){
            StringBuilder temp = new StringBuilder();
            int i = 0;
            while (i < sb.length()-1){
                int num1 = Integer.parseInt(String.valueOf(sb.charAt(i)));
                int num2 = Integer.parseInt(String.valueOf(sb.charAt(i+1)));
                int mod = (num1 + num2) % 10;
                temp.append(mod);
                i++;
            }
            sb = temp;
        }

        if(sb.charAt(0) == sb.charAt(1))return true;
        return false;
    }
}
