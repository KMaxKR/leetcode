package ValidParenthese;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
    Map<Integer, Character> el_list = Map.of(
            1, '(',
            2, ')',
            3, '[',
            4, ']',
            5, '{',
            6, '}');
    public boolean isValid(String s) {
        List<Integer> list = new ArrayList<>();
        char[] l = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            for (Map.Entry<Integer, Character> entry: el_list.entrySet()){
                if (entry.getValue().equals(l[i])){
                    list.add(entry.getKey());
                }
            }
        }
        int count = 0;
        for (int i = 0; i < list.size(); i += 2){
            if (list.get(i + 1) - list.get(i) == 1){
                count = 1;
            }else {
                count = 0;
            }
        }
        System.out.println(list);
        System.out.println(count == 1);
        return count == 1;
    }
}
