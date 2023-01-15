class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ret = new ArrayList<>();
        int[] candidates = new int[9];
        for (int i = 0; i < 9; i++) {
            candidates[i] = i + 1;
        }
        dfs(ret, candidates, k, n, new ArrayList<>(), 0, 0);
        return ret;
    }

    public void dfs(List<List<Integer>> ret, int[] candidates, int k, int n, List<Integer> current, int currentSum, int index) {
        if (currentSum == n && current.size() == k) {
            ret.add(new ArrayList<>(current));
        }
        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);
            dfs(ret, candidates, k, n, current, currentSum + candidates[i], i+1);
            current.remove(current.size()-1);
        }
    }
}
