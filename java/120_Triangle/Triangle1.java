class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] memo = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = Integer.MAX_VALUE;
            }
        }
        return helper(triangle, 0, 0, memo);
    }
    
    public int helper(List<List<Integer>> triangle, int i, int j, int[][] memo) {
        if (i == triangle.size() - 1) {
            return memo[i][j] = triangle.get(i).get(j);
        }
        else if (memo[i][j] != Integer.MAX_VALUE) {
            return memo[i][j];
        }
        int left = helper(triangle, i + 1, j, memo) + triangle.get(i).get(j);
        int right = helper(triangle, i + 1, j + 1, memo) + triangle.get(i).get(j);
        return memo[i][j] = Math.min(left, right);
    }
}
