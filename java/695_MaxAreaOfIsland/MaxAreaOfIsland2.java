
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ret = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false && grid[i][j] == 1) {
                    ret = Math.max(ret, dfs(grid, visited, i, j));
                }
            }
        }
        return ret;
    }
    
    public int dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || i>= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j] == true) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(grid, visited, i-1, j) + dfs(grid, visited, i, j-1) + dfs(grid, visited, i+1, j) + dfs(grid, visited, i, j+1);
    }
} 
