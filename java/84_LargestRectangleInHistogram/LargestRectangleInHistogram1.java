class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int[] leftFirstSmaller = new int[heights.length];
        int[] rightFirstSmaller = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
            if (stack.isEmpty()) leftFirstSmaller[i] = -1;
            else leftFirstSmaller[i] = stack.peek(); // 记录左边up to which index height becomes smaller than current height
            stack.push(i);
        }

        stack = new Stack<>(); 
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
            if (stack.isEmpty()) rightFirstSmaller[i] = heights.length;
            else rightFirstSmaller[i] = stack.peek(); // 记录右边up to which index height becomes smaller than current height
            stack.push(i);
        }

        int ret = 0;
        for (int i = 0; i < heights.length; i++) {
            int area = (rightFirstSmaller[i] - leftFirstSmaller[i] - 1) * heights[i];
            ret = Math.max(ret, area);
        }
        return ret;
    }
}
