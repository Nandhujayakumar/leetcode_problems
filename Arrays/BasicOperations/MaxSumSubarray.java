package BasicOperations;

public class MaxSumSubarray {
    
    public static void main(String[] args) {
        
        int arr[] = {1,9,-1,-2,7,3,-1,2};
        int k = 4;
        int sum =0;
        int maxsum= 0;
        int start =0;
        int end = 0;

        while (end < k) {
            sum = sum + arr[end];
            end++;
        }

        while (end < arr.length){
            sum += arr[end++] - arr[start++];
            maxsum = Math.max(maxsum, sum);
        }

        System.out.println("maxsum : " + maxsum);
    }
}
