class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // <prefixSum, number of occurrence>
        hm.put(0, 1);
        int totalPrefixSum = 0;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            totalPrefixSum += nums[i];
            int prevPrefixSum = totalPrefixSum - k;
            if (hm.containsKey(prevPrefixSum)) {
                ret += hm.get(prevPrefixSum);
            }
            hm.put(totalPrefixSum, hm.getOrDefault(totalPrefixSum, 0) + 1);
        }
        return ret;
    }
}
