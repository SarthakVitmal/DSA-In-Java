package Arrays;

public class countOperations {
    public static int countOperation(int num1,int num2){
        int ops = 0;
        if(num1 == 0 || num2 == 0)return 0;
        while (num1 > 0 || num2 > 0){
            if(num1 == 0 || num2 == 0)break;
            if(num1 >= num2){
                num1 = num1 - num2;
                ops++;
            }else {
                num2 = num2 - num1;
                ops++;
            }
        }
        return ops;
    }
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int ans = countOperation(num1,num2);
        System.out.println(ans);
    }
}
