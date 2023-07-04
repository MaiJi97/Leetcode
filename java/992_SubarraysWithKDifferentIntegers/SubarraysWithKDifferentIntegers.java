class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k-1);
    }

    private int atMostK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ret = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            while (j <= i && hm.size() > k) {
                hm.put(nums[j], hm.get(nums[j]) - 1);
                if (hm.get(nums[j]) == 0) hm.remove(nums[j]);
                j++;
            }
            ret += (i - j + 1);
        }
        return ret;
    }
}
