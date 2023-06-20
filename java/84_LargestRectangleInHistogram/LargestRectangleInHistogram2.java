class Solution {
    public int largestRectangleArea(int[] heights) {
        int ret = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                int pre = stack.pop();
                int width = i - (stack.isEmpty() ? 0 : stack.peek() + 1);
                int area = width * heights[pre];
                ret = Math.max(ret, area);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int pre = stack.pop();
            int width = heights.length - (stack.isEmpty() ? 0 : stack.peek() + 1);
            int area = width * heights[pre];
            ret = Math.max(ret, area);
        }
        return ret;
    }
}
