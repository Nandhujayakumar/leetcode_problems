package Problems;

import java.util.HashSet;
import java.util.Set;

public class Missingnumber_bruteforce {

    //bruteforce approch
    
    public static void main(String[] args) {
        
        int a[] = {0,1,2};  //len = 3 so [0,1,2,3]
        int len = a.length;
        Set<Integer> set = new HashSet<>();
        
        for (int i : a) {
            set.add(i);
        }

        for (int i = 0; i <= len; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
                break;
            }
        }

    }
}
