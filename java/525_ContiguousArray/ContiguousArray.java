class Solution {
    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }
        HashMap<Integer,Integer> hm = new HashMap<>(); // <prefixSum, index>
        hm.put(0, -1);
        int prefixSum = 0;
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            if (hm.containsKey(prefixSum)) ret = Math.max(ret, i - hm.get(prefixSum));
            else hm.put(prefixSum, i);
        }
        return ret;
    }
}
