package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_hashmap {
    
    public static void main(String[] args) {

        int arr[] = { 2, 4, 7, 3};
        int target = 5;
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
            int comp = target - arr[i];

            if (map.containsKey(comp)) {
                int newarr[] = {map.get(comp), i};
                System.out.println(Arrays.toString(newarr));
            }

            map.put(arr[i], i);

        }


    }
}
