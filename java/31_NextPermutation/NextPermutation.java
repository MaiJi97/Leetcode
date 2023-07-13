class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;
        // Step 1: Search from right to left until we find the substring that is not monotonically decreasing
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i+1]) i--;

        // Step 2: Swap the left boundary with the next greater element in the substring
        int target = i;

        if (target != -1) { // given permutation is not the last one
            int minDiff = Integer.MAX_VALUE; 
            for (int j = i + 1; j < nums.length; j++) { // look for next greater element
                int diff = nums[j] - nums[i];
                if (diff > 0 && diff < minDiff) {
                    minDiff = diff;
                    target = j;
                }
            }
            swap(nums, i, target);
        }

        // Step 3: Sort the subarray in ascending order
        Arrays.sort(nums, i+1, nums.length);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
