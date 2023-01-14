class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        dfs(nums, ret, new ArrayList<>(), 0);
        return ret;
    }

    public void dfs(int[] nums, List<List<Integer>> ret, List<Integer> current, int start) {
        ret.add(new ArrayList<>(current)); // 不论current是什么直接加入结果

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            dfs(nums, ret, current, i+1);
            current.remove(current.size()-1);
        }
    }
}
