class Solution {
    
    List<List<Integer>> ret = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, 0, new ArrayList<>());
        return ret;
    }
    
    public void dfs(int[] nums, int index, List<Integer> permutation) {
        if(permutation.size() == nums.length) {
            // deep copy because modifying it later will affect the result
            ret.add(new ArrayList<>(permutation)); 
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!permutation.contains(nums[i])) {
                permutation.add(nums[i]);
                dfs(nums, index + 1, permutation);
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}
