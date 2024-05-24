class Solution {

    List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, new ArrayList<>(), 0);
        return ret;
    }

    public void dfs(int[] nums, List<Integer> current, int start) {
        ret.add(new ArrayList<>(current)); // 不论current是什么直接加入结果

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            dfs(nums, current, i+1);
            current.remove(current.size() - 1);
        }
    }
}
