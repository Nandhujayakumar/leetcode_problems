package Problems;

import java.util.HashMap;

//#992

public class SubArrayWithKdiffInteger {

    public static void main(String[] args) {

        int a[] = {1,2,1,2,3};
        int k = 2;

        int result = calc(a, k) - calc(a, k-1);

        System.out.println(result);
    }

    public static int calc(int[] a, int k) {

        int start = 0, end =0, count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (end < a.length) {
            
            map.put(a[end], map.getOrDefault(a[end], 0)+1);

            //shreking phase
            while (map.size() > k) {
                map.put(a[start], map.get(a[start])-1);
                
                if (map.get(a[start]) == 0) {
                    map.remove(a[start]);
                }
                start++;
            }

            count = count + (end - start) + 1;
            end++;
        }

        return count;

        
    }


    
}
