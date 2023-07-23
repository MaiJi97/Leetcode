class Solution {
    public int search(int[] nums, int target) {
        
        // [3,4,5,6,7,8,0,1,2]
        // [7,8,0,1,2,3,4,5,6]
        
        int left = 0; 
        int right = nums.length - 1;
        while (left < right) { // find the pivot which is the smallest number in the array
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        
        int pivot = left;
        left = 0;
        right = nums.length - 1;
        if (target >= nums[pivot] && target <= nums[right]) { // reset the two pointers for a BS
            left = pivot;
        }
        else {
            right = pivot;
        }
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;    
    }
}
