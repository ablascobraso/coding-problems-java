import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> openByCloseParentheses = new HashMap<>();
        openByCloseParentheses.put(')','(');
        openByCloseParentheses.put('}','{');
        openByCloseParentheses.put(']','[');

        for(char c : s.toCharArray()){
            if(openByCloseParentheses.get(c) != null && !stack.isEmpty()){
                Character popped = stack.pop();
                if (popped != openByCloseParentheses.get(c)){
                    return false;
                }
            }
            else {
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "]";
        boolean isValid = isValid(s);
        System.out.println(isValid);
    }

}
