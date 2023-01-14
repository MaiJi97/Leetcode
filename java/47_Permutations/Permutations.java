class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        dfs(nums, ret, new ArrayList<>(), hm);
        return ret;
    }

    public void dfs(int[] nums, List<List<Integer>> ret, List<Integer> current, Map<Integer, Integer> hm) {
        if (current.size() == nums.length) {
            ret.add(new ArrayList<>(current));
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            if (count > 0) {
                current.add(key);
                hm.put(key, count - 1);
                dfs(nums, ret, current, hm);
                current.remove(current.size()-1);
                hm.put(key, count);
            }
        }
    }
}
