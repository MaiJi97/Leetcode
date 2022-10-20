class Solution {
    int[] deltaX = {0, 1, -1, 0};
    int[] deltaY = {1, 0, 0, -1};
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ret = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false && grid[i][j] == 1) {
                    ret = Math.max(ret, bfs(grid, visited, i, j));
                }
            }
        }
        return ret;
    }
    
    public int bfs(int[][] grid, boolean[][] visited, int i, int j) {
        int area = 1;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!q.isEmpty()) {
            int[] block = q.poll();
            for (int direction = 0; direction < 4; direction++) {
                int newX = block[0]+deltaX[direction];
                int newY = block[1]+deltaY[direction];
                if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length || grid[newX][newY] == 0 || visited[newX][newY] == true) {
                    continue;
                }
                area++;
                q.offer(new int[]{newX, newY});
                visited[newX][newY] = true;
            }
        }
        return area;
    }
} 
