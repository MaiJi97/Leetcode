class Solution {
    public int calculate(String s) {
        // 3 + 3 + (6 - 2)
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        int operation = 1;
        int ret = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }
            else if (c == '+') {
                ret += currentNumber * operation;
                currentNumber = 0;
                operation = 1;
            }
            else if (c == '-') {
                ret += currentNumber * operation;
                currentNumber = 0;
                operation = -1;
            }
            else if (c == '(') {
                stack.push(ret);
                stack.push(operation);
                ret = 0;
                operation = 1;
            }
            else if (c == ')') {
                ret += currentNumber * operation;
                ret *= stack.pop();
                ret += stack.pop();
                currentNumber = 0;
            }
        }
        return ret + currentNumber * operation;
    }
}
