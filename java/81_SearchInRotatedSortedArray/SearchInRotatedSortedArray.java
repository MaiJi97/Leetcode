class Solution {
    public boolean search(int[] nums, int target) {
        // [3,4,5,6,7,8,0,1,2]
        // [7,8,0,1,2,3,4,5,6]
      
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            else if (nums[mid] > nums[left]) {
                if (target <= nums[mid] && target >= nums[left]) { // target between left and mid, exluding mid
                    right = mid;
                }
                else {
                    left = mid + 1;
                }
            }
            else if (nums[mid] < nums[left]) {
                if (target > nums[mid] && target <= nums[right-1]) { // target between mid and right-1, excluding mid
                    left = mid + 1;
                }
                else {
                    right = mid;
                }
            }
            else {
                left++;
            }
        }
        return false;
    }
}
