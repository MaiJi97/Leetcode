class Solution {
    public int calculate(String s) {
        // 3 + 2 * 2 - 4
        //   ^ operation is '+', stack is [3]
        //       ^ operation is '+', stack is [3, 2]
        //           ^ operation is '*', stack is [3, 2 * 2]
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
                // can also use string builder
            }
            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == s.length()-1) {
                // evaluating last operation instead of the current one
                if (operation == '+') { 
                    stack.push(currentNumber);
                }
                else if (operation == '-') {
                    stack.push(-currentNumber);
                }
                else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                }
                else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = c;
                currentNumber = 0;
            }
        }
        int ret = 0;
        while (!stack.isEmpty()) ret += stack.pop();
        return ret;
    }
}
