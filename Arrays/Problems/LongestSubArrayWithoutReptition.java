package Problems;

import java.util.HashSet;
import java.util.Set;

// #3 leetcode

//sliding window

public class LongestSubArrayWithoutReptition {

    public static void main(String[] args) {
        
        String a = "pwwkew";
        int length = 0;
        int longest = 0;

        int i =0, j = 0;

        Set<Character> set = new HashSet<>();

        while (j < a.length()) {
            
            if (set.contains(a.charAt(j))) {
                set.remove(a.charAt(i));
                i++;
                
            }
            else{
                set.add(a.charAt(j));
                j++;

                length = set.size();
                longest = Math.max(length, longest);
            }
            System.out.println(set);
        }
        System.out.println(longest);

    }
    
}
