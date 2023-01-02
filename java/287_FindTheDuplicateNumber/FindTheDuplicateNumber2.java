class Solution {
    public int findDuplicate(int[] nums) { // 1,2,2,3,4 - 5 numbers
        int slow = nums[0];
        int fast = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                slow = nums[0];
                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
    }
}
