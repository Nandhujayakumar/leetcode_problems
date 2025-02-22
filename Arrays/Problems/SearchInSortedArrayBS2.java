import java.util.Arrays;

public class SearchInSortedArrayBS2 {
    
    public static void main(String[] args) {
        
        int a[] = {1,0,1,1,1};
        int target = 0;

        System.out.println(bs(a, target));
    }

    static boolean bs(int[] a, int target){

        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        int start = 0;
        int end = a.length-1;

        while (start <= end) {
            
            int mid = (start + end)/2;

            if (target == a[mid]) {
                return true;
            }

            
        }
        return false;
    }
}
