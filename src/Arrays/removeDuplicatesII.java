package Arrays;

public class removeDuplicatesII {
    public static int removeDuplicates(int[] arr){
        int len = 0;
        int i = 0,j = 0;
        int count = 0;
        int mark = Integer.MAX_VALUE;
        while(j<arr.length){
            if(arr[i] == arr[j]){
                if(count < 2){
                    j++;
                    count++;
                }else if(count < 3){
                    while(j < arr.length && arr[j] == arr[i]){
                        arr[j] = mark;
                        j++;
                    }
                }
            }else{
                i = j;
                len += count;
                count = 0;
            }
            System.out.println("Count: " +count);
            System.out.println("i: "+i);
            System.out.println("j: "+j);
            System.out.println("Length: "+len);
            System.out.println("-------------------");
        }
        if(count > 0 && count < 3)len += count;
        int l = 0;
        for (int k = 0; k < arr.length; k++) {
            if(arr[k] != mark){
                arr[l] = arr[k];
                l++;
            }
        }
        for (int k = 0; k < l; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }
}
