package Problems;

import java.util.Arrays;

//2656
public class MaxSumwith_Kelement {

    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5};
        int k = 3;

        Arrays.sort(a);
        int end = a[a.length - 1];
        int start = 1;
        int sum = 0;

        while (start <= k){
            sum = sum + end;
            end++;
            start++;
        }
        System.out.println(sum);
    }

    
}
