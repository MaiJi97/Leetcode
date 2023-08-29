class Solution {
    public boolean search(int[] nums, int target) {
        // [3,4,5,6,7,8,0,1,2]
        // [7,8,0,1,2,3,4,5,6]
      
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] == nums[right]) {
                right--;
            }
            else if (nums[mid] >= nums[left]) {
                if (target < nums[mid] && target >= nums[left]) { // target between left and mid
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[right]) { // target between mid and right-1
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
