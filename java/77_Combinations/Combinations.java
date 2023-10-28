class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        dfs(nums, k, ret, new ArrayList<>(), 0);
        return ret;
    }

    public void dfs(int[] nums, int k, List<List<Integer>> ret, List<Integer> current, int index) {
        if (current.size() == k) {
            ret.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            dfs(nums, k, ret, current, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
