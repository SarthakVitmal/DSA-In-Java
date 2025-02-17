package Stack;
import java.util.Scanner;
import java.util.Stack;
public class consecutiveDuplicatesInString {
    static String checkConsecutiveDuplicates(Stack<Character> st,String str){
        for (int i = 0; i < str.length(); i++) {
            if(!st.isEmpty() && st.peek() == str.charAt(i))st.pop();
            else st.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Original String : "+str);
        Stack<Character> st = new Stack<>();
        String s = checkConsecutiveDuplicates(st,str);
        System.out.println("Consecutive Duplicates Removed : "+s);
    }
}
