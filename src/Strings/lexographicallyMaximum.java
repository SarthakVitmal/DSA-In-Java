package Strings;

public class lexographicallyMaximum {
    public static void main(String[] args) {
        String str = "apple mango banana";
        char[] ch = str.toCharArray();
        int i = 0, j = 0;
        String maxWord = " ";


        while(j <= ch.length){
            if(j == ch.length || ch[j] == ' '){
                String currentWord = str.substring(i,j);
                char firstLetter = currentWord.charAt(0);
                if(firstLetter > maxWord.charAt(0)){
                    maxWord = currentWord;
                }
                i = j + 1;
            }
            j++;
        }
        System.out.println(maxWord);
    }
}
