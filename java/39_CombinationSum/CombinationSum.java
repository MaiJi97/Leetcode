class Solution {
    
    public List<List<Integer>> ret = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) { 
        int[] cleanCandidates = removeDuplicates(candidates);
        List<Integer> combination = new ArrayList<>();
        dfs(cleanCandidates, target, 0, combination);
        return ret;
    }
    
    public int[] removeDuplicates(int[] candidates) {
        Set<Integer> hs = new HashSet<>();
        for (int num : candidates) {
            hs.add(num);
        }
        int[] cleanCandidates = new int[hs.size()];
        int i = 0;
        for (int num : hs) {
            cleanCandidates[i] = num;
            i++;
        }
        Arrays.sort(cleanCandidates);
        return cleanCandidates;
    }
    
    public void dfs(int[] candidates, int target, int index, List<Integer> combination) {
        if (target == 0) {
            ret.add(new ArrayList<Integer>(combination));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] > target) {
                return;
            }
            combination.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
