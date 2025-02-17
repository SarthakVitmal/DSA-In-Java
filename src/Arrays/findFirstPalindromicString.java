package Arrays;

class findFirstPalindromicString{

    public static String checkFirstPalindrome(String[] srr){
        for(int x=0;x<srr.length;x++){
            String s = "";
            int i = srr[x].length()-1;
            while(i>=0){
                s += srr[x].charAt(i);
                i--;
            }
            if(s.equals(srr[x])){
                return s;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] srr = {"apple","racecar","level"};

        System.out.println("First Palindromic String : "+checkFirstPalindrome(srr));
    }
}