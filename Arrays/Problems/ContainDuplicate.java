package Problems;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate {
    

    public static void main(String[] args) {
        
        int a[] = {1,2,3,4};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i,i);
        }
        if (a.length > map.size()) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
