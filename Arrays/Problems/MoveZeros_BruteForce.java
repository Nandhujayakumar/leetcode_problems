package Problems;

import java.util.Arrays;

public class MoveZeros_BruteForce {
    
    public static void main(String[] args) {
        
         int arr[] = {0,1,0,3,12};

         Arrays.sort(arr);
         int newarr[] = new int[5];
         int last = newarr.length-1;
         int start=0;

         for (int i = 0; i < newarr.length; i++) {
            
            if (arr[i] != 0) {
                newarr[start] = arr[i];
                start++;
            }
            else{
                newarr[last] = 0;
                last--;
            }
         }

        System.out.println(Arrays.toString(newarr));

    }
}
