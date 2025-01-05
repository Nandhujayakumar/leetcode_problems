package Problems;

import java.util.Arrays;

//sorted array

public class TwoSum_sorted {
    
    public static void main(String[] args) {
        
        
        int arr[] = {2,3,4};
        int newarr[] = new int[2];
        int i = 0;
        int j = arr.length-1;
        int target = 6;

        while (i < j) {
            if (arr[i]+arr[j] == target) {
                newarr[0] = i;
                newarr[1] = j;
                break;
            }
            else if (arr[i]+arr[j] > target) {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(newarr));


    }
}
