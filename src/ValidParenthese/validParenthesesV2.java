package ValidParenthese;

import java.util.Stack;

public class validParenthesesV2 {
    public boolean isValid(String s) {
        Stack<Character> l = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '('){
                l.push(')');
            } else if (ch == '{') {
                l.push('}');
            }else if (ch == '['){
                l.push(']');
            }else if(l.isEmpty() || l.pop() != ch){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(l.isEmpty());
        return l.isEmpty();
    }
}
