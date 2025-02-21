public class SearchinRotatedArray {
    
    public static void main(String[] args) {
        
        int[] a = {5,1,2,3,4};
        int target = 1;

        System.out.println(bs(a, target));

    }

    static int bs(int[] a, int target){

        int start = 0;
        int end = a.length-1;

        while (start <= end) {
            
            int mid = (start + end)/2;

            if (a[mid] == target) {
                return mid;
            }
            
            if (a[start] <= a[mid]) {
                if (target<a[mid] && a[start] <= target) {
                    end = mid-1;
                }
                else{
                    start=mid+1;
                }
                
            }
            else{
                if (a[start] <=  target  && target > a[mid]) {
                    end = mid-1;
                }
                else if (a[start] >  target  && target < a[mid]) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
