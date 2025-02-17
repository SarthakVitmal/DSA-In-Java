package Arrays;

public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        char ans = '0';

        for (int i = 0; i < letters.length; i++) {
            if((int)letters[i] > (int)target){
                ans = letters[i];
                break;
            }else if((int)letters[i] < (int)target){
                ans = letters[0];
            }
        }
        System.out.println(ans);
    }
}
