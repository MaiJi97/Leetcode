class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > arr.get(arr.size() - 1)) { // if larger than last element in arr, add it
                arr.add(nums[i]);
            }
            else { // if smaller than last element, then find the index of the first element in the arr that is larger than the current number, and replace it
                int index = binarySearch(arr, nums[i]);
                arr.set(index, nums[i]);
            }
        }
        return arr.size();
        
    }
    
    public int binarySearch(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } 
            else if (arr.get(mid) > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return right + 1;
    }
}
