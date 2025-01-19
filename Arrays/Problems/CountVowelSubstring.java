package Problems;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountVowelSubstring {
    
    public static void main(String[] args) {
        
        String a = "cuaieuouac";

        System.out.println(calc(a));
        

    }

    public static int calc(String a) {
        int i = 0, j =0;
        int k = 5;
        int count = 0;

        Set<Character> set = new HashSet<>();
        Collections.addAll(set, 'a', 'e', 'i', 'o', 'u');

        Map<Character, Integer> vom = new HashMap<>();

        while (i < a.length() - k + 1) {
            
            

        }
        
        
        return 0;
    }

    
}
