class Solution {
    int ret = 0;
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return dfs(nums, k, 0, new HashMap<Integer, Integer>()) - 1;
    }

    public int dfs(int[] nums, int k, int index, HashMap<Integer, Integer> hm) {
        if (index == nums.length) {
            return 1;
        }

        int pick = 0;
        if (!hm.containsKey(nums[index] - k)) {
            hm.put(nums[index], hm.getOrDefault(nums[index], 0) + 1);
            pick = dfs(nums, k, index + 1, hm);
            hm.put(nums[index], hm.get(nums[index]) - 1);
            if (hm.get(nums[index]) == 0) hm.remove(nums[index]);
        }
        int nopick = dfs(nums, k, index + 1, hm);
        return pick + nopick;
    }
}
