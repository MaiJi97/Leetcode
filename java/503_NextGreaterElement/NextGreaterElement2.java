class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ret = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length * 2 - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % nums.length]) {
                stack.pop();
            }
            ret[i % nums.length] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i % nums.length]);
        }
        return ret;
    }
}
