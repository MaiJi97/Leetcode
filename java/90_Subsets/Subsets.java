class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, ret, new ArrayList<>(), 0);
        return ret;
    }

    public void dfs(int[] nums, List<List<Integer>> ret, List<Integer> current, int start) {
        ret.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) { 
            if (i != start && nums[i] == nums[i-1]) {
                continue;
            }
            current.add(nums[i]);
            dfs(nums, ret, current, i+1);
            current.remove(current.size()-1);
        }
    }
}
