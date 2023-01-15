class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) { 
        List<List<Integer>> ret = new ArrayList<>();
        dfs(ret, candidates, target, new ArrayList<>(), 0, 0);
        return ret;
    }
    
    public void dfs(List<List<Integer>> ret, int[] candidates, int target, List<Integer> current, int index, int currentSum) { 
        // we can also simplify the paratermeters and replace target and currentSum with targetSum
        if (currentSum == target) {
            ret.add(new ArrayList<>(current));
            return;
        }
        if (currentSum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);
            int sum = currentSum + candidates[i];
            dfs(ret, candidates, target, current, i, sum);
            current.remove(current.size()-1);
        }
    }
}
