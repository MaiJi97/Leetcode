class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= stack.peek()[0]) stack.pop();
            ret[i] = stack.isEmpty() ? 0 : stack.peek()[1] - i;
            stack.push(new int[] {temperatures[i], i});
        }
        return ret;
    }
}
