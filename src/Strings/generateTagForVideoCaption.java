package Strings;

public class generateTagForVideoCaption {
    public static void main(String[] args) {
        String caption = " ";
        String ans = generateTag(caption);
        System.out.println(ans);
    }

    private static String generateTag(String caption) {
        caption = caption.trim();
        if(caption.isEmpty())return "#";
        String[] words = caption.split("\\s+");
        if(words.length == 0)return "#";
        StringBuilder sb = new StringBuilder("#");
        String firstWord = words[0].toLowerCase();
        sb.append(firstWord);
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            sb.append(capitalized);
        }
        StringBuilder cleaned = new StringBuilder("#");
        for (int i = 0; i < sb.length(); i++) {
            if(Character.isLetter(sb.charAt(i)))cleaned.append(sb.charAt(i));
        }
        if(cleaned.length() > 100)return cleaned.substring(0,100);
        return cleaned.toString();
    }
}
