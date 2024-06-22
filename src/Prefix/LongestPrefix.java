package Prefix;


public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        for (int i = 0; i < strs.length - 1; i++){
            char[] prev = strs[i].toCharArray();
            char[] next = strs[i + 1].toCharArray();
            for (int j = 0; j < Math.min(prev.length, next.length); j++){
                if (prev[j] == next[j] && !output.contains(String.valueOf(prev[j]))){
                    output += prev[j];
                }
            }
        }

        return output.toString();
    }
}
