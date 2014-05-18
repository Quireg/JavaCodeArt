
public class ArrayUtil {

    public static int findMax(int[] arr){
        int res = 0;
        int pointer = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > res){
                res = arr[i];
                pointer = i;
            }
        }
        return arr[pointer];
    }
    public static int findMin(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]> res){
                res = i;
            }
        }
        return arr[res];
    }
}
