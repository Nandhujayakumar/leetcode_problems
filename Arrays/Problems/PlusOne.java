package Problems;

import java.util.Arrays;

public class PlusOne {
    
    public static void main(String[] args) {
        
        int arr[] = {2,9,9,9,9,9,9,9};

        for (int i = arr.length-1; i >= 0; i--) {
            
            if (i < 9) {
                arr[i]++;
                System.out.println(Arrays.toString(arr));
            }
            arr[i]=0;
        }
        
        arr = new int[arr.length + 1];
        arr[0] = 1;
        System.out.println(Arrays.toString(arr));

    }
}
