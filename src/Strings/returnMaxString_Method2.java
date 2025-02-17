package Strings;

public class returnMaxString_Method2 {

    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0') return s.substring(i);
        }
        return s;
    }
    public static String max(String a,String b){
        String s = purify(a),t = purify(b);

        if(s.length() < t.length())return b;
        if(s.length() > t.length())return a;
        if(s.length() == t.length()){
            for (int i = 0; i < s.length(); i++) {
                while(s.charAt(i) != t.charAt(i)){
                    if(s.charAt(i) > t.charAt(i)) return a;
                }
            }
        }
        return b;
    }
    public static void main(String[] args) {
        String[] arr = {"1234","0000000078","867564","009384"};
        String maxString = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxString = max(maxString,arr[i]);
        }
        System.out.println("Max String : "+maxString);
    }
}
