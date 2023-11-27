class Solution {
    public int search(int[] nums, int target) {
        
        // [7,8,0,1,2,3,4,5,6]
        // [3,4,5,6,7,8,0,1,2]
    
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] <= nums[right]) {
                if (target > nums[mid] && target <= nums[right]) { // target between left and mid
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else {
                if (target < nums[mid] && target >= nums[left]) { // target between mid and right-1
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
