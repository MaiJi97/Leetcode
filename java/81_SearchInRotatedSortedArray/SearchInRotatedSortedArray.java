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
            else if (nums[mid] > nums[left]) {
                if (target <= nums[mid] && target >= nums[left]) { // target in left half
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else if (nums[mid] < nums[left]) {
                if (target >= nums[mid] && target <= nums[right]) { // target in right 
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else {
                left++;
            }
        }
        return false;
    }
}
