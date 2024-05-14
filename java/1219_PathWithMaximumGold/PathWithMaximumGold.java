class Solution {
    public int getMaximumGold(int[][] grid) {
        int ret = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    int count = dfs(grid, i, j, visited);
                    ret = Math.max(ret, count);
                }
            }
        }
        return ret;
    }

    public int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int temp1 = Math.max(dfs(grid, i + 1, j, visited), dfs(grid, i - 1, j, visited));
        int temp2 = Math.max(dfs(grid, i, j - 1, visited), dfs(grid, i, j + 1, visited));
        visited[i][j] = false;
        return Math.max(temp1, temp2) + grid[i][j];
    }
}
