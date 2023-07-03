class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // <remainder of prefixSum divided by k, number of occurrence>
        hm.put(0, 1);
        int ret = 0;
        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;
            if (remainder < 0) {
                remainder += k; // Because -1 % 5 = -1, but we need the positive mod 4
            }
            if (hm.containsKey(remainder)) {
                ret += hm.get(remainder);
            }
            hm.put(remainder, hm.getOrDefault(remainder, 0) + 1);
        }
        return ret;
    }
}
