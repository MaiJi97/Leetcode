class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<>();
        while (i < pushed.length || j < popped.length) {
            while (i < pushed.length && (stack.isEmpty() || stack.peek() != popped[j])) {
                stack.push(pushed[i]);
                i++;
            }
            if (stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
            else return false;
        }
        return stack.isEmpty();
    }
}
