class Solution {
    public int subarraySum(int[] nums, int k) {
        int ret = 0;
        HashMap<Integer, Integer> hm = new HashMap<>(); // <prefixSum, frequencies>
        int[] prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
          prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        for (int i = 0; i < prefixSum.length; i++) {
            int target = prefixSum[i] - k;
            if (hm.containsKey(target)) {
                ret += hm.get(target);
            }
            hm.put(prefixSum[i], hm.getOrDefault(prefixSum[i], 0) + 1);
        }
        return ret;
    }
}
