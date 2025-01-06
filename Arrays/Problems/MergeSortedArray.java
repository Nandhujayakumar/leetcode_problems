package Problems;

import java.util.Arrays;

public class MergeSortedArray {
    
    public static void main(String[] args) {
        
        // [2,3,4,0,0,0]   [5,6,7]
        // n = 3 m =3

        int num1[] = {1};
        int num2[] = {};
        int n = 1;

        for (int i = n, j=0; i < num1.length; i++, j++) {
                num1[i] = num2[j];
            }
            Arrays.sort(num1);
            System.out.println(Arrays.toString(num1));
    }
}
