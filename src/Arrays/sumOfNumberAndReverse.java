package Arrays;


public class sumOfNumberAndReverse {
    public static int rev(int num){
        String n = String.valueOf(num);
        StringBuilder rev = new StringBuilder();
        for (int i = n.length()-1; i >= 0; i--) {
            rev.append(n.charAt(i));
        }
        return Integer.parseInt(rev.toString());
    }
    public static boolean sumOfNumAndRev(int num){
        if(num == 0)return true;
        for (int i = 0; i < num; i++) {
            if(i + rev(i) == num)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 0;
        boolean result = sumOfNumAndRev(num);
        System.out.println(result);
    }
}
