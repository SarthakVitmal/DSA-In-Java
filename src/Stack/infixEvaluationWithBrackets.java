package Stack;

import java.util.Stack;

public class infixEvaluationWithBrackets {
    public static int priority(char x){
        if(x == '(')return 0;
        if(x == '*' || x == '/')return 2;
        if(x == '+' || x == '-')return 1;
        return -1;
    }
    public static int performOperation(int val1,char op,int val2){
        if(op == '*')return val1*val2;
        if(op == '+')return val1+val2;
        if(op == '-')return val1-val2;
        if(op == '/')return val1/val2;
        return 0;
    }

    public static int infixEvaluation(String s){
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9')num.push(ch - '0');
            else if(ch == '(')op.push(ch);
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (!op.isEmpty() && priority(op.peek()) >= priority(ch)){
                    int val2 = num.pop();
                    char operator = op.pop();
                    int val1 = num.pop();
                    int result = performOperation(val1,operator,val2);
                    num.push(result);
                }
                op.push(ch);
            }
            else if(ch == ')'){
                while(!op.isEmpty() && op.peek() != '('){
                    int val2 = num.pop();
                    char operator = op.pop();
                    int val1 = num.pop();
                    int result = performOperation(val1,operator,val2);
                    num.push(result);
                }
                op.pop();
            }
            else op.push(ch);
        }
        while (!op.isEmpty()){
            int val2 = num.pop();
            char operator = op.pop();
            int val1 = num.pop();
            int result = performOperation(val1,operator,val2);
            num.push(result);
        }
        return num.peek();
    }
    public static void main(String[] args) {
        String s = "9-(5+3)*(4/6)";
        int res = infixEvaluation(s);
        System.out.println(res);
    }
}
