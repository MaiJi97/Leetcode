class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                if (nums[mid] == target) return mid;
                else end = mid;
            }
        }
        return -1;
    }
}
