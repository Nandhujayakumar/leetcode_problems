package Problems;

public class SearchInsertElement {
    
    public int searchInsert(int[] arr, int target) {

        for (int i=0; i<arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
            else if (i == 0 && target < arr[i]) {
            return 0;
            }
            else if (i > 0 && arr[i] > target && arr[i-1] < target) {
                return i;
            }
            else if( i == arr.length-1){
                return i+1;
            }
    }
    return -1;
       
    }
}
