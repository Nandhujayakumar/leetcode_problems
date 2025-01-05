package Problems;

import java.util.Arrays;

public class TwoSum {
    
    public static void main(String[] args) {
        
        // [2,3,6,4,5,7] -> compliment will be good

        int arr[] = {2,4,11,3};
        int target = 6;
        int newarr[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int comp = target-arr[i];
            
            for (int j = 1; j < arr.length-1; j++) {
                if (arr[j] == comp) {
                    newarr[0]=i;
                    newarr[1]=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}


