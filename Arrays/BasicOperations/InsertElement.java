package BasicOperations;
import java.util.Arrays;

public class InsertElement {
    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7};
        
        int target = 4;

        int[] newarr = new int[arr.length + 1];


        //copyig till index index 3 to add ele 4

        for (int i = 0; i < arr.length+1; i++) {
            if (i == 3) {
                newarr[i] = target;
            }
            else if (i<3) {
                newarr[i] = arr[i];
            }
            else{
                newarr[i] = arr[i-1];
            }
        }
    
        System.out.println(Arrays.toString(newarr));
    }
}
