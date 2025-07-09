package Strings;

public class checkIfTwoChessboardSquaresHasSameColor {
    public static void main(String[] args) {
        String coordinate1 = "a1";
        String coordinate2 = "h3";
        boolean ans = checkTwoChessboards(coordinate1,coordinate2);
        System.out.println(ans);
    }

    private static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        boolean color1 = getCoordinateColor(coordinate1);
        boolean color2 = getCoordinateColor(coordinate2);
        if(color1 && color2)return true;
        if(!color1 && !color2)return true;
        return false;
    }

    private static boolean getCoordinateColor(String coordinates) {
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
