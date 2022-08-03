class Solution {
    public int findDuplicate(int[] nums) { // 1,2,2,3,4 - 5 numbers
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}
