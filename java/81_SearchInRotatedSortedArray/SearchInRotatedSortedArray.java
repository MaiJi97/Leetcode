class Solution {
    public boolean search(int[] nums, int target) {

        // [7,8,0,1,2,3,4,5,6]
        // [3,4,5,6,7,8,0,1,2]
    
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] == nums[right]) right--;
            else if (nums[mid] < nums[right]) { // pivot on the left half (right half is sorted)
                if (target >= nums[mid] && target <= nums[right]) { // target on the right half
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else { // pivot on the right half (left half is sorted)
                if (target <= nums[mid] && target >= nums[left]) { // target on the left half
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return false; 
    }
}
