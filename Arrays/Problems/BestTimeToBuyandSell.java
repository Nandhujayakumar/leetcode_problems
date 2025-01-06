package Problems;

public class BestTimeToBuyandSell {
    
    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int maxprofit =0;
        int profit = 0;

        for (int i : arr) {
            
            if (i < min) {
                min= i;
            }
            else{
                profit = i - min;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        System.out.println(maxprofit);

        
    }
}
