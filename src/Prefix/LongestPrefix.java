package Prefix;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder output = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return output.toString();
            }
            output.append(first.charAt(i));
        }
        return output.toString();
    }
}
