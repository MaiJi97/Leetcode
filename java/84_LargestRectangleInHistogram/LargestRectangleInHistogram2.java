class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();

        int ret = 0;

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int pre = stack.pop();
                int width = i - (stack.isEmpty() ? 0 : stack.peek() + 1);
                ret = Math.max(ret, width * heights[pre]);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int pre = stack.pop();
            int width = heights.length - (stack.isEmpty() ? 0 : stack.peek() + 1);
            ret = Math.max(ret, width * heights[pre]);
        }
        
        return ret;
    }
}
