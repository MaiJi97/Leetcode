class Solution {
    
    int[] deltaX = {0, 1, 0, -1};
    int[] deltaY = {1, 0, -1, 0};
        
    public int numIslands(char[][] grid) {
        int count = 0;
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;    
        boolean[][] visited = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false && grid[i][j] == '1') {
                    dfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(int i, int j, char[][] grid, boolean[][] visited) {
         if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || visited[i][j] == true) return;
         
         visited[i][j] = true;

         for (int direction = 0; direction < 4; direction++) {
             dfs(i + deltaX[direction], j + deltaY[direction], grid, visited);
         }
     }
}
