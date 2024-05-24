class Solution {

    List<List<Integer>> ret = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, new ArrayList<>(), 0);
        return ret;
    }

    public void dfs(int[] nums, List<Integer> current, int start) {
        if (start == nums.length) {
            ret.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[start]); 
        dfs(nums, current, start + 1); // taking the current element and continue
        current.remove(current.size() - 1);
        
        dfs(nums, current, start + 1); // not taking the current element and continue
    }
}
