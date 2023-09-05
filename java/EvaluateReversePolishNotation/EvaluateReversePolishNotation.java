class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String element : tokens) {
            if (!element.equals("+") && !element.equals("-") && !element.equals("*") && !element.equals("/")) stack.push(Integer.valueOf(element));
            else {
                int first = stack.pop();
                int second = stack.pop();
                if (element.equals("+")) stack.push(second + first);
                if (element.equals("-")) stack.push(second - first);
                if (element.equals("*")) stack.push(second * first);
                if (element.equals("/")) stack.push(second / first);
            }
        }
        return stack.peek();
    }
}
