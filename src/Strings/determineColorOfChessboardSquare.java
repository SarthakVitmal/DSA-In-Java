package Strings;

public class determineColorOfChessboardSquare {
    public static void main(String[] args) {
        String coordinates = "a1";
        boolean ans = squareIsWhite(coordinates);
        System.out.println(ans);
    }

    private static boolean squareIsWhite(String coordinates) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coordinates.length(); i++) {
            if(Character.isLetter(coordinates.charAt(i))){
                sb.append(coordinates.charAt(i) - 'a' + 1);

            }else sb.append(coordinates.charAt(i));
        }
        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += Integer.parseInt(String.valueOf(sb.charAt(i)));
        }
        return sum % 2 == 0;
    }
}
