package valid_parentheses;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
class Solution2 {

    public static void main(String[] args) {
        System.out.print(new Solution2().isValid("([)]"));
    }

    /**
     * 使用了栈数据结构
     * 暂时没想到改进思路 代码细节调整
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (char value : array) {
            if(!stack.isEmpty() && isSymmetry(stack.peek(), value)){
                stack.pop();
            }else{
                stack.add(value);
            }
        }
        return stack.isEmpty();
    }

    private boolean isSymmetry(char c, char t){
        switch (c){
            case '{' :
                return t == '}';
            case '[' :
                return t == ']';
            case '(' :
                return t == ')';
        }
        return false;
    }
}
