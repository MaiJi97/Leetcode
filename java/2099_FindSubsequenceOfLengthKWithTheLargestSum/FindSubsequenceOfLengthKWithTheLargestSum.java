class Pair {
    int val;
    int index;
    
    public Pair(int val, int index) {
        this.val=val;
        this.index=index;
    }
}

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        Pair[] pairs = new Pair[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new Pair(nums[i], i);
        }
        Arrays.sort(pairs, (a, b) -> a.val - b.val);
        Arrays.sort(pairs, nums.length-k, nums.length, (a, b) -> a.index - b.index);
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = pairs[i + nums.length - k].val;
        }
        return ret;
    }
}
