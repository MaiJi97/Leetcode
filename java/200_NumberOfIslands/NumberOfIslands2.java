class Solution {
    
    class Coordinate {
        int x, y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
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
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.offer(new Coordinate(i, j));
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            Coordinate curr = queue.poll();
            for (int[] direction : directions) {
                int newX = curr.x + direction[0];
                int newY = curr.y + direction[1];
                if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length || grid[newX][newY] == '0' || visited[newX][newY] == true) {
                    continue;
                }
                queue.offer(new Coordinate(newX, newY));
                visited[newX][newY] = true;
            }
        }
    }
}
