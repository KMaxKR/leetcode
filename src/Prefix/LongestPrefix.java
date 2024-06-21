package Prefix;

import java.util.HashSet;
import java.util.Set;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        char[] f_el = strs[0].toCharArray();
        StringBuilder output = new StringBuilder();
        int count = 0;
        for (int i = 1; i < strs.length; i++) {
            char[] el = strs[i].toCharArray();
            count = Math.min(Math.min(f_el.length, el.length), strs.length);
            for (int j = 0; j < count; j++) {
                char[] r = strs[j].toCharArray();
                if (f_el[j] == r[j]) {
                    output.append(f_el[j]);
                } else {
                    break;
                }
            }
        }
        HashSet<Character> out = new HashSet<>();
        for (char ch : output.toString().toCharArray()){
            out.add(ch);
        }
        output = new StringBuilder(out.toString());
        return output.toString();
    }
}
