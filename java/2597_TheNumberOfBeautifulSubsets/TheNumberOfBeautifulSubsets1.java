class Solution {
    int ret = 0;
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        dfs(nums, k, 0, new HashMap<Integer, Integer>());
        return ret - 1; // non empty
    }

    public void dfs(int[] nums, int k, int index, HashMap<Integer, Integer> hm) {
        ret++;
        for (int i = index; i < nums.length; i++) {
            if (!hm.containsKey(nums[i] - k)) {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
                dfs(nums, k, i + 1, hm);
                hm.put(nums[i], hm.get(nums[i]) - 1);
                if (hm.get(nums[i]) == 0) hm.remove(nums[i]);
            }
        }
    }
}
