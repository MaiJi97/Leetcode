class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] bucketSort = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            bucketSort[nums[i]]++;
        }
        int[] memo = new int[max + 1];
        Arrays.fill(memo, -1);
        return maxEarn(bucketSort, max, memo);
    }

    public int maxEarn(int[] bucketSort, int index, int[] memo) {
        if (bucketSort.length == 0) return 0;
        if (index == 0 || index == 1) return bucketSort[index] * index;
        else if (memo[index] != -1) return memo[index];
        int earn = Math.max((maxEarn(bucketSort, index - 2, memo) + bucketSort[index] * index), maxEarn(bucketSort, index - 1, memo));
        memo[index] = earn;
        return earn;
    }
}
