class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            int current = nums[i];
            int count = 0;
            while (i < nums.length && nums[i] == current) {
                if (count < 2) {
                    nums[j++] = current;
                }
                i++;
                count++;
            }
        }
        return j;
    }
}
