class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
                // if(c == ')' && !stack.isEmpty() && stack.peek() == '(' ){
                //     stack.pop();
                // } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                //     stack.pop();
                // } else if( c == ']' && !stack.isEmpty()&& stack.peek() == '['){
                //     stack.pop();
                // } else {
                //     return false;
                // }
            }
        }
        return stack.isEmpty();
    }
}
