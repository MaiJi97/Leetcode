class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            int target = 0 - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    ret.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left + 1 < nums.length && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    while (right - 1 > left && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if (nums[left] + nums[right] < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return ret;
    }
}
