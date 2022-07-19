class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ret = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                ret[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                ret[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                ret[j] = nums[i];
                j++;
            }
        }
        return ret;
    } 
}
