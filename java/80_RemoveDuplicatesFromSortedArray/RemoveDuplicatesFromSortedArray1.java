class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
                count = 1;
            }
            else {
                if (count < 2) {
                    j++;
                    nums[j] = nums[i];
                    count++;
                }
                else {
                    count++;
                }
            }
        }
        return j + 1;
    }
}
