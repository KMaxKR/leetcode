package ValidParenthese;

import java.util.Stack;

public class validParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            stack.push(ch);
        }
        for (int i = 0; i < stack.size(); i++){
            if (stack.elementAt(i) == stack.lastElement()) {
                stack.pop();
            }
        }
        long[][] l = new long[][]{};
        return stack.isEmpty();
    }
}
