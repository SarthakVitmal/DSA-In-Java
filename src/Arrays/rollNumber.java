package Arrays;

public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {90,45,34,87,67,13,30};

        for(int i=0;i<arr.length;i++){
            if(arr[i] < 35){
                System.out.println("Roll No : "+i);
            }
        }
    }
}
