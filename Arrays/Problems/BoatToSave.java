import java.util.Arrays;

public class BoatToSave {

    public static void main(String[] args) {

        int[] arr = {3,5,3,4};
        int limit = 5;
         
        System.out.println(countBoat(arr, limit));


    }

    public static int countBoat(int[] a, int limit) {

        Arrays.sort(a);

        // 3 3 4 5
        int i = 0;
        int j = a.length-1;
        int count = 0;

        while(i<=j){
            if((a[j]+a[i])<=limit){
                i++;
            }
            j--;
            count++;
        }
        return count;

    }
    
}
