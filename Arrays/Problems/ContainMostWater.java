package Problems;

import java.util.HashMap;
import java.util.Map;

public class ContainMostWater {
    
    public static void main(String[] args) {

        int a[] = {8,7,2,1};
        int i = 0;
        int j = a.length-1;
        int area = 0;
        int maxarea = Integer.MIN_VALUE;

        while(i < j) {
            
            area = Math.abs(j-i) * Math.min(a[i], a[j]);

            if (maxarea < area) {
                maxarea = area;
            }

            if (a[j] > a[i] ) {
                i++;
            }
            else{
                j--;
            }

        }

        System.out.println(maxarea);


    }
}
