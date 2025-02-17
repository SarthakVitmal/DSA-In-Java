package Strings;

public class frequencyArray {
    public static void main(String[] args) {
        String str = "abacaa";
        int []arr = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int index = (int)(ch - 97);
            arr[index]++;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]) max = arr[i];
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                char ch = (char)(i + 97);
                System.out.println("Character : "+ch);
            }
        }
        System.out.println("Max Frequency : "+max);
    }
}
