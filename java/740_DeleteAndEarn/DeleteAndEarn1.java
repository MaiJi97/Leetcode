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

    public int maxEarn(int[] bucketSort, int max, int[] memo) {
        if (max == 0) return memo[0] = 0;
        else if (max == 1) return memo[1] = bucketSort[1] * 1;
        else if (memo[max] != -1) return memo[max];
        else {
            memo[max] = Math.max(maxEarn(bucketSort, max - 1, memo), maxEarn(bucketSort, max - 2, memo) + bucketSort[max] * max);
            return memo[max];
        }
    }
}
