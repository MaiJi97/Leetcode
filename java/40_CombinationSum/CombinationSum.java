class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(ret, candidates, target, new ArrayList<>(), 0, 0);
        return ret;
    }

    public void dfs(List<List<Integer>> ret, int[] candidates, int target, List<Integer> current, int currentSum, int index) {
        if (currentSum == target) {
            ret.add(new ArrayList<>(current));
            return;
        }
        if (currentSum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i-1]) continue;
            current.add(candidates[i]);
            dfs(ret, candidates, target, current, currentSum+candidates[i], i+1);
            current.remove(current.size()-1);
        }
    }
}
