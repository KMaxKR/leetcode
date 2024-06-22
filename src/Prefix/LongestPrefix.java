package Prefix;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        LinkedList<Character> list = new LinkedList<>(){};
        for (int i = 0; i < strs.length - 1; i++){
            char[] prev = strs[i].toCharArray();
            char[] next = strs[i + 1].toCharArray();
            for (int j = 0; j < Math.min(prev.length, next.length); j++){
                if (prev[j] == next[j]){
                    list.add(prev[j]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    output += list.get(i);
                }
            }
        }
        return output;
    }
}
