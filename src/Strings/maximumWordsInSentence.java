package Strings;

public class maximumWordsInSentence {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int maxLen = maxWordsFound(sentences);
        System.out.println(maxLen);
    }

    private static int maxWordsFound(String[] sentences) {
        int maxLen = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            int spaces = 0;
            for(char ch1 : sentences[i].toCharArray()){
                if(ch1 == ' ')spaces++;
            }
            maxLen = Math.max(maxLen,spaces+1);
        }
        return maxLen;
    }
}
