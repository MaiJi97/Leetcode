class Solution {
    public int calculate(String s) {
        int currentNumber = 0;
        char operation = '+';
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }
            
            else if (c == '(') {
                int braces = 1;
                int j = i + 1;
                for (; j < s.length(); j++) {
                    if (s.charAt(j) == '(') braces++;
                    if (s.charAt(j) == ')') braces--;
                    if (braces == 0) break;
                }
                currentNumber = calculate(s.substring(i + 1, j));
                i = j;
            }

            if (!Character.isDigit(c) && !Character.isWhitespace(c) || i == s.length()-1){
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
        while(!stack.isEmpty()) ret += stack.pop();
        return ret;
    }
}
