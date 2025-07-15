package Strings;

public class checkIfWordSummationEqualTwoWords {
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        boolean ans = isSumEqual(firstWord,secondWord,targetWord);
        System.out.println(ans);
    }

    private static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstNum = wordToInteger(firstWord);
        int secondNum = wordToInteger(secondWord);
        int targetNum = wordToInteger(targetWord);
        if(targetNum == firstNum + secondNum)return true;
        return false;
    }

    private static int wordToInteger(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i) - 'a');
        }
        return Integer.parseInt(sb.toString());
    }
}
