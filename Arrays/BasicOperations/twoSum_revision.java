package BasicOperations;

import java.util.Arrays;

public class twoSum_revision {
    

    public static void main(String[] args) {

        int[] a = {3,2,4};

        System.out.println(Arrays.toString(calc(a, 6)));
        
    }

    public static int[] calc(int[] a, int target) {

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int left =0;
        int right = a.length-1;

        while (left < right) {
            
            int sum = a[left] + a[right];

            if (sum == target) {
                return new int[]{left, right};
            }

            else if (sum > target) {
                right--;
            }
            else{
                left++;
            }

        }
        return null;
    }
}
