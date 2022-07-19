class Solution {
    public void sortColors(int[] nums) {
        int left = -1;
        int right = nums.length;
        int i = 0;
        while (i < right) {
            if (nums[i] == 0) {
                left++;
                swap(nums, left, i);
                i++;
            }
            else if (nums[i] == 1) {
                i++;
            }
            else {
                right--;
                swap(nums, right, i);
            }
        }
    }
    
    public void swap (int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
