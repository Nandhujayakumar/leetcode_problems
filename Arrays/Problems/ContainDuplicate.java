package Problems;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate {
    

    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,1};

        boolean output = dup(a);
        System.out.println(output);
    }

    public static boolean dup(int[] a) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if (!map.containsKey(i)) {
                map.put(i,i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
