package Strings;

public class detectCapital {
    public static void main(String[] args) {
        String s = "lllfllFlll";
        boolean ans = detectCapitalUse(s);
        System.out.println(ans);
    }

    private static boolean detectCapitalUse(String s) {
        //checking if all letters are uppercase
        boolean isAllUppercase = true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < 65 || s.charAt(i) > 90){
                isAllUppercase = false;
                break;
            }
        }
        System.out.println("----------------------------");
        if (isAllUppercase) return true;

        //checking if all letters are lowercase
        boolean isAllLowercase = true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) < 97 || s.charAt(i) > 122){
                isAllLowercase = false;
                break;
            }
        }
        System.out.println("++++++++++++++++++++++++++++++");
        if (isAllLowercase) return true;

        //checking if first letter is uppercase and rest lowercase
        if(s.charAt(0) >= 65 && s.charAt(0) <= 90){
            boolean isLowercase = true;
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i) < 97 || s.charAt(i) > 122){
                    isLowercase = false;
                    break;
                }
            }
            if(isLowercase)return true;
        }
        System.out.println("**********************************");
        return false;
    }
}
