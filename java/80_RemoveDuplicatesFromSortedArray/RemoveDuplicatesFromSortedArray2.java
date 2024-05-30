class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            int current = nums[i];
            int count = 0;
            while (i < nums.length && nums[i] == current) {
                if (count < 2) {
                    nums[j] = current;
                    j++;
                    count++;
                }
                i++;
            }
        }
        return j;
    }
}
