class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return dfs(triangle, 0, 0);
    }

    public int dfs(List<List<Integer>> triangle, int i, int j) {
        if (i == triangle.size() - 1) return triangle.get(i).get(j);
        else {
            return Math.min(dfs(triangle, i + 1, j, currentSum + triangle.get(i).get(j)), dfs(triangle, i + 1, j + 1, currentSum + triangle.get(i).get(j)));
        }
    }
}
