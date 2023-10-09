class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long[] left = new long[maxHeights.size()];
        long[] right = new long[maxHeights.size()];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < maxHeights.size(); i++) {
            long current = maxHeights.get(i);
            while (!stack.isEmpty() && maxHeights.get(stack.peek()) > current) stack.pop(); // keep the stack monotonically increasing 
            left[i] = stack.isEmpty() ? current * (i + 1) : left[stack.peek()] + current * (i - stack.peek()); // sum from the leftmost element up to current element
            stack.push(i);
        }
        stack = new Stack<>();
        for (int i = maxHeights.size() - 1; i >= 0; i--) {
            long current = maxHeights.get(i);
            while (!stack.isEmpty() && maxHeights.get(stack.peek()) > current) stack.pop(); // keep the stack monotonically decreasing
            right[i] = stack.isEmpty() ? current * (maxHeights.size() - i) : right[stack.peek()] + current * (stack.peek() - i); // sum from the rightmost element up to current element
            stack.push(i);
        }
        long ret = 0;
        for (int i = 0; i < maxHeights.size(); i++) {
            ret = Math.max(ret, left[i] + right[i] - maxHeights.get(i));
        }
        return ret;
    }
}
