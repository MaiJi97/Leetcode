class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int ret = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int pre = stack.pop();
                if (stack.isEmpty()) break;
                int minHeight = Math.min(height[i], height[stack.peek()]);
                ret += (minHeight - height[pre]) * (i - stack.peek() - 1);
            }
            stack.push(i);
        }
        return ret;
    }
}
