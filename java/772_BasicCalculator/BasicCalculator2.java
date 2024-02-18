class Solution {
    public int calculate(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> operationStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int currentNumber = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    currentNumber += currentNumber * 10 + (s.charAt(i) - '0');
                    i++;
                }
                numStack.push(currentNumber);
                i--;
            }
            else if (c == '(') {
                operationStack.push(c);
            }
            else if (c == ')') {
                while (operationStack.peek().charValue() != '(') {
                    numStack.push(apply(numStack.pop(), numStack.pop(), operationStack.pop().charValue()));
                }
                operationStack.pop();
            }
            else {
                while (!operationStack.isEmpty() && operationStack.peek().charValue() != '(' && (c == '+' || c == '-' || operationStack.peek().charValue() == '*' || operationStack.peek().charValue() == '/')) {
                    numStack.push(apply(numStack.pop(), numStack.pop(), operationStack.pop().charValue()));
                }
                operationStack.push(c);
            }
        }

        while (!operationStack.isEmpty()) {
            numStack.push(apply(numStack.pop(), numStack.pop(), operationStack.pop().charValue()));
        }
        return numStack.pop();
    }

    private int apply(int n2, int n1, char op) {
        switch(op) {
            case '+': return n1 + n2;
            case '-': return n1 - n2;
            case '*': return n1 * n2;
            default: return n1 / n2;
        }
    }
}
