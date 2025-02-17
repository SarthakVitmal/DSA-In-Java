package Strings;

public class updateEvenPositionOfString {
    public static void main(String[] args) {
        String s = "PhysicsWallah";
        String res = "";

        for(int i=0;i<s.length();i++){
            if(i%2 == 0){
                res +='a';
            } else{
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
