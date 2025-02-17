package Arrays;

public class maxValueOfString {
    public static boolean isNumeric(String s){
        for(char ch : s.toCharArray()){
            if(!Character.isDigit(ch))return false;
        }
        return true;
    }
    public static int maxValue(String[] str){
        int max = 0;
        int val;

        for(String s : str){
            if(isNumeric(s)){
                val = Integer.parseInt(s);
            }else{
                val = s.length();
            }
            max = Math.max(val,max);
        }
        return max;
    }
    public static void main(String[] args) {
        String[] s = {"alic3","bob","3","4","00000"};
        int res = maxValue(s);
        System.out.println(res);
    }
}
