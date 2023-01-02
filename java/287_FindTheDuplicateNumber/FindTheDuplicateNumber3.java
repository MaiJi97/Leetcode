class Solution {
    public int findDuplicate(int[] nums) { // 1,2,2,3,4 - 5 numbers
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                return index + 1;
            }
            nums[index] *= (-1);
        }
        return -1;
    }
}
