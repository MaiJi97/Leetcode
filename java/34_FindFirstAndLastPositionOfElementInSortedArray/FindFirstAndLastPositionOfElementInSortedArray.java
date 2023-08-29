class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        ret[0] = searchStartIndex(nums, target);
        ret[1] = searchEndIndex(nums, target);
        return ret;
    
    }
    
    public int searchStartIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
    
    public int searchEndIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }
}
