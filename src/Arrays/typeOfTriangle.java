package Arrays;

public class typeOfTriangle {
    public static void main(String[] args) {
        int[] arr = {3,3,3};
        String ans = triangleType(arr);
        System.out.println(ans);
    }

    private static String triangleType(int[] arr) {
        boolean isValid = isValidTriangle(arr);
        if(!isValid) return "none";
        boolean isEquilateral = checkIsEquilateral(arr);
        if(isEquilateral) return "equilateral";
        boolean isIsosceles = checkIsIsosceles(arr);
        if(isIsosceles) return "isosceles";
        boolean isScalene = checkIsScalene(arr);
        if(isScalene) return "scalene";
        return "";
    }

    private static boolean checkIsScalene(int[] arr) {
        int side1 = arr[0];
        int side2 = arr[1];
        int side3 = arr[2];
        if(side1 != side2 && side2 != side3 && side1 != side3)return true;
        return false;
    }

    private static boolean checkIsIsosceles(int[] arr) {
        int side1 = arr[0];
        int side2 = arr[1];
        int side3 = arr[2];
        if(side1 == side2 || side2 == side3 || side1 == side3)return true;
        return false;
    }

    private static boolean checkIsEquilateral(int[] arr) {
        int side1 = arr[0];
        int side2 = arr[1];
        int side3 = arr[2];
        if(side1 == side2 && side2 == side3)return true;
        return false;
    }

    private static boolean isValidTriangle(int[] arr) {
        int side1 = arr[0];
        int side2 = arr[1];
        int side3 = arr[2];
        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2)return true;
        return false;
    }
}
