class Solution {
    
    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        class Coordinate {
        int x, y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
        
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
                    bfs(i, j, grid, visited);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void bfs(int i, int j, char[][] grid, boolean[][] visited) {
        Queue<int[]> q = new ArrayDeque<>();
        visited[0][0] = true;
        q.offer(new int[]{i, j});
        while (!q.isEmpty()) {
            int[] current = q.poll();
            for (int[] direction : directions) {
                int newX = current[0] + direction[0];
                int newY = current[1] + direction[1];
                if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length || grid[newX][newY] == '0' || visited[newX][newY] == true) {
                    continue;
                }
                visited[newX][newY] = true;
                q.offer(new int[]{newX, newY});
            }
        }
    }
}
