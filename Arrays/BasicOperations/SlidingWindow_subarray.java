package BasicOperations;

public class SlidingWindow_subarray {
    
    public static void main(String[] args) {
        
        int a[] = {100,200,300,400,500};
        int k = 3;
        int n = a.length;

        int sum = 0;
        int index = 0;
        int maxsum = 0;

       while (index < n && index < k) {
        sum = sum + a[index];
        index++;
       }

       maxsum=sum;

       for (int i = 1; i < n-k+1; i++) {
        sum = sum - a[i-1] + a[i+k -1];
        maxsum = Math.max(maxsum, sum);
       }

       System.out.println(maxsum);
    }

}
