class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }
    
    public int countAtMost(int[] nums, int k) {
        int ret = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            while (hm.size() > k) { // 不能写做size == k,因为会miss掉(1,2,1),(1,2,1,2)的情况
                hm.put(nums[j], hm.getOrDefault(nums[j], 0) - 1);
                if (hm.get(nums[j]) == 0) {
                    hm.remove(nums[j]);
                }
                j++;
            }
            ret += i - j + 1;
        }
        return ret;
    }
}
