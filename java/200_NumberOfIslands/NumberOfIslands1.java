class Solution {
    
    class Coordinate {
        int x, y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
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
                    bfs(i, j, grid, visited); // we are using the same visited matrix each time we call bfs()
                    count++;
                }
            }
        }
        return count;
    }
    
    private void bfs(int i, int j, char[][] grid, boolean[][] visited) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{i, j});
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int[] current = q.poll();
            for (int direction = 0; direction < 4; direction++) {
                int newX = current[0] + deltaX[direction];
                int newY = current[1] + deltaY[direction];
                if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length || grid[newX][newY] == '0' || visited[newX][newY] == true) {
                    continue;
                }
                q.offer(new int[]{newX, newY});
                visited[newX][newY] = true;
            }
        }
    }
}
