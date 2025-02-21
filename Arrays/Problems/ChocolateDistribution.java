public class ChocolateDistribution {
    
    public static void main(String[] args) {
        
        int[] a = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        System.out.println(cal(a,m));
            }
        
        public static int cal(int[] a, int m) {
            //3, 4, 1, 9, 56, 7, 9, 12

            int i = 0, j = 0, diff = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            
            while (j < m) {
                if (a[j] < min) {
                    min = a[j];
                }
                else if (a[j] > max) {
                    max = a[j];
                }
                j++;
            }
            System.out.println("i: "+i +" j: "+j);
            return diff = max - min;


        }
}
