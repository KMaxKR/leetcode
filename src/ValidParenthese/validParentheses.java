package ValidParenthese;

import java.util.Stack;

public class validParentheses {
    public boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        for (Character el : s.toCharArray()){
            if (el == '('){
                list.push(')');
            } else if (el == '{'){
                list.push('}');
            } else if (el == '['){
                list.push(']');
            } else if (list.contains(el)){
                list.pop();
            }else{
                return false;
            }

        }
        if (list.size() % 2 != 0){
            return false;
        }else {
            return list.isEmpty();
        }
    }
}
