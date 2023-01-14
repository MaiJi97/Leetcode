class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        dfs(nums, ret, new ArrayList<>());
        return ret;
    }
    
    public void dfs(int[] nums, List<List<Integer>> ret, List<Integer> current) {
        if (current.size() == nums.length) {
            ret.add(new ArrayList<>(current));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!current.contains(nums[i])) {
                current.add(nums[i]);
                dfs(nums, ret, current);
                current.remove(current.size()-1);
            }
        }
    }
}
