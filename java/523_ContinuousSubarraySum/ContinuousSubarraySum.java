class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // <remainder, earliest index>
        hm.put(0, -1);
        int totalPrefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalPrefixSum += nums[i];
            int remainder = totalPrefixSum % k;
            if (hm.containsKey(remainder)) {
                if (i - hm.get(remainder) > 1) return true;
            }
            else hm.put(remainder, i);
        }
        return false;
    }
}
