class Solution {
    public int findDuplicate(int[] nums) { // 1,2,2,3,4 - 5 numbers
        int[] frequencies = new int[nums.length];
        for (int num : nums) {
            frequencies[num - 1]++;
        }
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == 2) return i + 1;
        }
        return -1;
    }
}
