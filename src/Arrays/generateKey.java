package Arrays;

public class generateKey {
    public static void main(String[] args) {
        int num1 = 987;
        int num2 = 879;
        int num3 = 798;

        int ans = generateK(num1,num2,num3);
        System.out.println(ans);
    }

    private static int generateK(int num1, int num2, int num3) {
        String s1 = checkSize(num1);
        String s2 = checkSize(num2);
        String s3 = checkSize(num3);
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        char[] ch3 = s3.toCharArray();
        int min1 = Math.min(Math.min(ch1[0]-'0',ch2[0]-'0'),ch3[0]-'0');
        int min2 = Math.min(Math.min(ch1[1]-'0',ch2[1]-'0'),ch3[1]-'0');
        int min3 = Math.min(Math.min(ch1[2]-'0',ch2[2]-'0'),ch3[2]-'0');
        int min4 = Math.min(Math.min(ch1[3]-'0',ch2[3]-'0'),ch3[3]-'0');
        StringBuilder sb = new StringBuilder();
        sb.append(min1); sb.append(min2); sb.append(min3); sb.append(min4);
        return Integer.parseInt(sb.toString());
    }
    private static String checkSize(int num){
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);
        if(sb.length() == 4)return sb.toString();
        else{
            while (sb.length() != 4){
                sb.insert(0,'0');
            }
        }
        return sb.toString();
    }
}
