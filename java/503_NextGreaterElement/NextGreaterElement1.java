class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean assign = false;
            for (int j = i + 1; j < i + nums.length; j++) {
                if (nums[j % nums.length] > nums[i]) {
                    ret[i] = nums[j % nums.length];
                    assign = true;
                    break;
                }
            }
            if (assign == false) ret[i] = -1;
        }
        return ret;
    }
}
